import java.awt.*;

class Pix {
  int x;
  int y;
  float value;

  Pix(int x, int y, float value) {
    this.x = x;
    this.y = y;
    this.value = value;
  }

  void render(Graphics g, int l) {
    Color color = new Color(0, this.value, 0);
    g.setColor(color);
    g.fillRect(this.x*l, this.y*l, l, l);
  }
}
