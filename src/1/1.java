import processing.video.*;
Captrue cam;
void setup()
{
    size(640, 480);
    String[] cameras = Capture.list();
    printArray(cameras);
    cam = new Capture(this, cameras[0]);
    cam.start();
}
void draw()
{
    if (cam.available() == false)
    {
        return;
    }
    cam.read();
    image(cam, 0, 0);
}