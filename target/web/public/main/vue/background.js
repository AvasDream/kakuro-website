
function setup() {
  SCREEN_SIZE = createVector(windowWidth , windowHeight);
  var canvas = createCanvas(SCREEN_SIZE.x, SCREEN_SIZE.y, WEBGL);
  canvas.position(0,0);
  canvas.style('z-index', '-1');
  background(0);
}
function draw() {
  background(0);
  let locX = mouseX - width / 2;
  let locY = mouseY - height / 2;
  // pointlight(r,g,b,x,y,z)
  pointLight(250, 250, 250, locX, locY, 50);
  // Ambient is a Material that reflects light
  specularMaterial(250);
  translate(0,200,-50);
  sphere(100,100,100);
}
function windowsResized() {
  resizeCanvas(windowWidth , windowHeight);
}
