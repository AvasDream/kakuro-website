var snake;
var s_scale = 20;

function setup() {

  var canvas = createCanvas(650, 650);
  canvas.parent("snakeCanvas")
  frameRate(10);
  snake = new Snake();
  food = new Food();
  food.appear();
  if (snake.eat(food)) {
    food.appear();
  }

}

function draw() {
  background(0);
  snake.update();
  snake.show();
  food.show()
}

function keyPressed(){
  switch (keyCode) {
    case (UP_ARROW || "w"):
      snake.direction(0, -1);
      break;
    case (DOWN_ARROW || "s"):
      snake.direction(0, 1);
      break;
    case (RIGHT_ARROW || "d"):
      snake.direction(1, 0);
      break;
    case (LEFT_ARROW || "a"):
      snake.direction(-1, 0);
      break;
    default:

  }
}
function Snake() {
  this.x = 0;
  this.y = 0;
  this.xspeed = 1;
  this.yspeed = 0;


  this.update = function() {
    this.x = this.x + this.xspeed * s_scale;
    this.y = this.y + this.yspeed * s_scale;

    this.x = constrain(this.x, 0, width - s_scale);
    this.y = constrain(this.y, 0, height - s_scale);
  }
  this.eat = function (food) {
    var distance = dist(this.x, this.y, food.x, food.y);
    if (distance < 2) {
      return true;
    } else {
      return false;
    }
  }
  this.show = function() {
    fill(255);
    rect(this.x, this.y, 10, 10);
  }
  this.direction = function(x,y) {
    this.xspeed = x;
    this.yspeed = y;
  }
}

function Food() {
  this.x = random(width);
  this.y = random(height);

  this.appear = function() {
    var cols = floor(width / s_scale)
    var rows = floor(height / s_scale)
    this.x = floor(random(cols))
    this.y = floor(random(rows))
    //this.mult(s_scale)
  }
  this.show = function () {
    fill(255)
    rect(this.x, this.y, s_scale, s_scale)
  }
}
