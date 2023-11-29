import processing.video.*;
Capture cam;
void setup()
{
    size(640, 480);
    String[] cameras = Capture.list();
    printArray(cameras);
    cam = new Capture(this, cameras[29]);
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