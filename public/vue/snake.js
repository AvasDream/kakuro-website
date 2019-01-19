var GRID_SIZE = 20;
var DIFFICULTY = 10;
var SCREEN_SIZE;
var GAMEOVER = true;

var snake;
var food;
var scl = 20;

function setup() {
  SCREEN_SIZE = createVector(640 , 640);
  var canvas = createCanvas(SCREEN_SIZE.x, SCREEN_SIZE.y);
  canvas.parent("snakeCanvas");
  frameRate(DIFFICULTY);
  snake = new Snake();
  setFood();
}

function startGame() {
  document.getElementById("snake_start").innerHTML = "Start";
  document.getElementById("snake_score").innerHTML = "Score: 0";
  GAMEOVER = false;
  setup();
}

function draw() {
  background(0);
  if (!GAMEOVER) {
    snake.death();
    snake.update();
    snake.show();
    if(snake.eat(food)){
        setFood();
    }
    fill(0, 102, 34);
    rect(food.x, food.y, scl, scl);
  } else {
    background(0);
  }

}

function setFood(){
    var cols = floor(width/scl);
    var rows = floor(height/scl);
    food = createVector(floor(random(cols)), floor(random(rows)));
    food.mult(scl);
}

function keyPressed(){
    if(keyCode === UP_ARROW || keyCode === 87){
        snake.direction(0, -1);
    }else if(keyCode === DOWN_ARROW || keyCode === 83){
        snake.direction(0, 1);
    }else if(keyCode === RIGHT_ARROW || keyCode === 68){
        snake.direction(1, 0);
    }else if(keyCode === LEFT_ARROW || keyCode === 65){
        snake.direction(-1, 0);
    }
}
/*
Snake Object below
*/

function Snake(){
    this.x = 0;
    this.y = 0;
    this.xspeed = 1;
    this.yspeed = 0;
    this.total = 0;
    this.tail = [];
    this.index=0;
    this.divScore;

    this.death = function(){
        for(var i = 0; i < this.tail.length; i++){
            var pos = this.tail[i];
            var d = dist(this.x, this.y, pos.x, pos.y);
            if(d < 1){
                document.getElementById("snake_start").innerHTML = "Restart";
                document.getElementById("snake_score").innerHTML = "Game over! Score: " + this.total;
                GAMEOVER = true;
                this.total = 0;
                this.tail=[];
            }
        }
    }
    this.show = function(){
        fill(255);
        for( var i=0; i< this.tail.length; i++){
            rect(this.tail[i].x, this.tail[i].y, scl, scl);
        }
        rect(this.x, this.y, scl, scl);
    }
    this.direction = function(x, y){
        this.xspeed = x;
        this.yspeed = y;
    }
    this.eat = function(pos) {
        var d = dist(this.x, this.y, pos.x, pos.y);
        if (d < 1){
            this.total++;
            document.getElementById("snake_score").innerHTML = "Score: " + this.total;
            return true;
        } else {
            return false;
        }
    }
    this.update = function(){
        if(this.total === this.tail.length){
            for( var i = 0; i< this.tail.length-1; i++){
                this.tail[i] = this.tail[i+1];
            }
        }
        this.tail[this.total-1] = createVector(this.x, this.y);
        this.x = this.x + this.xspeed * scl;
        this.y = this.y + this.yspeed * scl;

        this.x = constrain(this.x, 0, width-scl);
        this.y = constrain(this.y, 0, height-scl);
    }
}

// Prevent Scrolling with arrow keys
$('document').ready(function(){
  window.addEventListener("keydown", function(e) {
      if([32, 37, 38, 39, 40].indexOf(e.keyCode) > -1) {
          e.preventDefault();
      }
  }, false);
});
