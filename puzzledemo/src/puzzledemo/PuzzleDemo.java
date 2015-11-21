package puzzledemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class PuzzleDemo extends JFrame implements ActionListener {
	public static void main(String args[]) {

		PuzzleDemo pd = new PuzzleDemo();
		pd.setVisible(true);
	}

	private JPanel drawPan = new JPanel();
	private JButton btnDraw = new JButton("随机生成图块");
	private JButton btnDraw0 = new JButton("生成可拼接图块");
	
	String pixelColor10 = null;
	String pixelColor62 = null;
	String pixelColor26 = null;
	String pixelColor52 = null;
	String pixelColor20 = null;
	String pixelColor42 = null;
	String pixelColor30 = null;
	String pixelColor24 = null;
	String pixelColor14 = null;
	String pixelColor40 = null;
	String pixelColor64 = null;
	String pixelColor50 = null;
	String pixelColor46 = null;
	String pixelColor36 = null;
	String pixelColor60 = null;
	String pixelColor45 = null;
	String pixelColor55 = null;
	String pixelColor65 = null;
	String pixelColor33 = null;
	String pixelColor43 = null;
	String pixelColor23 = null;
	String pixelColor11 = null;
	String pixelColor21 = null;
	String pixelColor61 = null;
	String pixelColor12 = null;
	String pixelColor22 = null;
	String pixelColor32 = null;
	String pixelColor34 = null;
	String pixelColor44 = null;
	String pixelColor54 = null;
	String pixelColor16 = null;
	String pixelColor56 = null;
	String pixelColor66 = null;

	public PuzzleDemo() {

		super("Puzzle");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);

		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());

		c.add(btnDraw);
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				repaint();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		

		c.add(btnDraw0);
		btnDraw0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				right();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		drawPan.setBorder(new BevelBorder(1));
		drawPan.setBackground(Color.white);
		drawPan.setPreferredSize(new Dimension(800, 690));
		c.add(drawPan);
	}

	public void repaint() { // 随机生成七个拼图块
		Graphics2D g2 = (Graphics2D) drawPan.getGraphics();

		for (int i = 0; i <= 6; i++) {

			int add1[] = { 390, 218, 390, 562, 562, 390, 218 };
			int add2[] = { 350, 250, 150, 250, 450, 550, 450 };
			int x = add1[i];
			int y = add2[i];

			// 生成六个颜色的数组，每个拼图块随机生成六种颜色并且颜色不能重复
			Color c[] = { Color.black, Color.red, Color.orange, Color.pink,
					Color.green, Color.blue };

			Random rd = new Random();
			int j1 = rd.nextInt(6);

			g2.setColor(c[j1]);
			int X1[] = { x, x - 50, x - 100 };
			int Y1[] = { y, y - 86, y };
			g2.drawPolygon(X1, Y1, 3);
			g2.fillPolygon(X1, Y1, 3);

			int j2 = rd.nextInt(6);
			do {
				j2 = rd.nextInt(6);
			} while (j2 == j1);
			g2.setColor(c[j2]);
			int X2[] = { x, x - 50, x + 50 };
			int Y2[] = { y, y - 86, y - 86 };
			g2.drawPolygon(X2, Y2, 3);
			g2.fillPolygon(X2, Y2, 3);

			int j3 = rd.nextInt(6);
			do {
				j3 = rd.nextInt(6);
			} while (j3 == j1 || j3 == j2);
			g2.setColor(c[j3]);
			int X3[] = { x, x + 50, x + 100 };
			int Y3[] = { y, y - 86, y };
			g2.drawPolygon(X3, Y3, 3);
			g2.fillPolygon(X3, Y3, 3);

			int j4 = rd.nextInt(6);
			do {
				j4 = rd.nextInt(6);
			} while (j4 == j1 || j4 == j2 || j4 == j3);
			g2.setColor(c[j4]);
			int X4[] = { x, x + 100, x + 50 };
			int Y4[] = { y, y, y + 86 };
			g2.drawPolygon(X4, Y4, 3);
			g2.fillPolygon(X4, Y4, 3);

			int j5 = rd.nextInt(6);
			do {
				j5 = rd.nextInt(6);
			} while (j5 == j1 || j5 == j2 || j5 == j3 || j5 == j4);
			g2.setColor(c[j5]);
			int X5[] = { x, x + 50, x - 50 };
			int Y5[] = { y, y + 86, y + 86 };
			g2.drawPolygon(X5, Y5, 3);
			g2.fillPolygon(X5, Y5, 3);

			int j6 = rd.nextInt(6);
			do {
				j6 = rd.nextInt(6);
			} while (j6 == j1 || j6 == j2 || j6 == j3 || j6 == j4 || j6 == j5);
			g2.setColor(c[j6]);
			int X6[] = { x, x - 50, x - 100 };
			int Y6[] = { y, y + 86, y };
			g2.drawPolygon(X6, Y6, 3);
			g2.fillPolygon(X6, Y6, 3);
		}
	}
	
	Color c[] = { Color.black, Color.red, Color.orange, Color.pink,
			Color.green, Color.blue };
	Random rd = new Random();

	public void right() { // 生成七个可拼接的拼图块
		Graphics2D g2 = (Graphics2D) drawPan.getGraphics();

		

		// 先生成四个拼图块，满足条件后保持不变
		do {
			for (int i = 0; i <= 3; i++) {
				int add1[] = { 390, 390, 562, 218 };
				int add2[] = { 350, 150, 450, 450 };
				int x = add1[i];
				int y = add2[i];

				int j1 = rd.nextInt(6);
				g2.setColor(c[j1]);
				int X1[] = { x, x - 50, x - 100 };
				int Y1[] = { y, y - 86, y };
				g2.drawPolygon(X1, Y1, 3);
				g2.fillPolygon(X1, Y1, 3);
				if (i == 0) {
					pixelColor10 = c[j1].toString();
				} else if (i == 1) {
					pixelColor12 = c[j1].toString();
				} else if (i == 2) {
					pixelColor14 = c[j1].toString();
				} else if (i == 3) {
					pixelColor16 = c[j1].toString();
				}

				int j2 = rd.nextInt(6);
				do {
					j2 = rd.nextInt(6);
				} while (j2 == j1);
				g2.setColor(c[j2]);
				int X2[] = { x, x - 50, x + 50 };
				int Y2[] = { y, y - 86, y - 86 };
				g2.drawPolygon(X2, Y2, 3);
				g2.fillPolygon(X2, Y2, 3);
				if (i == 0) {
					pixelColor20 = c[j2].toString();
				} else if (i == 1) {
					pixelColor22 = c[j2].toString();
				} else if (i == 2) {
					pixelColor24 = c[j2].toString();
				} else if (i == 3) {
					pixelColor26 = c[j2].toString();
				}

				int j3 = rd.nextInt(6);
				do {
					j3 = rd.nextInt(6);
				} while (j3 == j1 || j3 == j2);
				g2.setColor(c[j3]);
				int X3[] = { x, x + 50, x + 100 };
				int Y3[] = { y, y - 86, y };
				g2.drawPolygon(X3, Y3, 3);
				g2.fillPolygon(X3, Y3, 3);
				if (i == 0) {
					pixelColor30 = c[j3].toString();
				} else if (i == 1) {
					pixelColor32 = c[j3].toString();
				} else if (i == 2) {
					pixelColor34 = c[j3].toString();
				} else if (i == 3) {
					pixelColor36 = c[j3].toString();
				}

				int j4 = rd.nextInt(6);
				do {
					j4 = rd.nextInt(6);
				} while (j4 == j1 || j4 == j2 || j4 == j3);
				g2.setColor(c[j4]);
				int X4[] = { x, x + 100, x + 50 };
				int Y4[] = { y, y, y + 86 };
				g2.drawPolygon(X4, Y4, 3);
				g2.fillPolygon(X4, Y4, 3);
				if (i == 0) {
					pixelColor40 = c[j4].toString();
				} else if (i == 1) {
					pixelColor42 = c[j4].toString();
				} else if (i == 2) {
					pixelColor44 = c[j4].toString();
				} else if (i == 3) {
					pixelColor46 = c[j4].toString();
				}

				int j5 = rd.nextInt(6);
				do {
					j5 = rd.nextInt(6);
				} while (j5 == j1 || j5 == j2 || j5 == j3 || j5 == j4);
				g2.setColor(c[j5]);
				int X5[] = { x, x + 50, x - 50 };
				int Y5[] = { y, y + 86, y + 86 };
				g2.drawPolygon(X5, Y5, 3);
				g2.fillPolygon(X5, Y5, 3);
				if (i == 0) {
					pixelColor50 = c[j5].toString();
				} else if (i == 1) {
					pixelColor52 = c[j5].toString();
				} else if (i == 2) {
					pixelColor54 = c[j5].toString();
				} else if (i == 3) {
					pixelColor56 = c[j5].toString();
				}

				int j6 = rd.nextInt(6);
				do {
					j6 = rd.nextInt(6);
				} while (j6 == j1 || j6 == j2 || j6 == j3 || j6 == j4
						|| j6 == j5);
				g2.setColor(c[j6]);
				int X6[] = { x, x - 50, x - 100 };
				int Y6[] = { y, y + 86, y };
				g2.drawPolygon(X6, Y6, 3);
				g2.fillPolygon(X6, Y6, 3);
				if (i == 0) {
					pixelColor60 = c[j6].toString();
				} else if (i == 1) {
					pixelColor62 = c[j6].toString();
				} else if (i == 2) {
					pixelColor64 = c[j6].toString();
				} else if (i == 3) {
					pixelColor66 = c[j6].toString();
				}
			}
		} while (!pixelColor52.equals(pixelColor20)
				|| !pixelColor14.equals(pixelColor40)
				|| !pixelColor36.equals(pixelColor60)
				|| pixelColor62.equals(pixelColor26)
				|| pixelColor42.equals(pixelColor24)
				|| pixelColor64.equals(pixelColor46)
				|| pixelColor62.equals(pixelColor10)
				|| pixelColor26.equals(pixelColor10)
				|| pixelColor42.equals(pixelColor30)
				|| pixelColor24.equals(pixelColor30)
				|| pixelColor64.equals(pixelColor50)
				|| pixelColor46.equals(pixelColor50));

		// 生成剩余的三个拼图块
		int x1 = 218, y1 = 250;
		int j31 = rd.nextInt(6);
		do {
			j31 = rd.nextInt(6);
		} while (!c[j31].toString().equals(pixelColor62)); // 对应色块颜色相同后取颜色随机函数循环停止颜色固定不变
		g2.setColor(c[j31]);
		int X31[] = { x1, x1 + 50, x1 + 100 };
		int Y31[] = { y1, y1 - 86, y1 };
		g2.drawPolygon(X31, Y31, 3);
		g2.fillPolygon(X31, Y31, 3);

		int j41 = rd.nextInt(6);
		do {
			j41 = rd.nextInt(6);
		} while (!c[j41].toString().equals(pixelColor10));
		g2.setColor(c[j41]);
		int X41[] = { x1, x1 + 100, x1 + 50 };
		int Y41[] = { y1, y1, y1 + 86 };
		g2.drawPolygon(X41, Y41, 3);
		g2.fillPolygon(X41, Y41, 3);

		int j51 = rd.nextInt(6);
		do {
			j51 = rd.nextInt(6);
		} while (!c[j51].toString().equals(pixelColor26));
		g2.setColor(c[j51]);
		int X51[] = { x1, x1 + 50, x1 - 50 };
		int Y51[] = { y1, y1 + 86, y1 + 86 };
		g2.drawPolygon(X51, Y51, 3);
		g2.fillPolygon(X51, Y51, 3);

		int j11 = rd.nextInt(6);
		do {
			j11 = rd.nextInt(6);
		} while (c[j11].toString().equals(pixelColor62)
				|| c[j11].toString().equals(pixelColor10)
				|| c[j11].toString().equals(pixelColor26));
		pixelColor11 = c[j11].toString();
		g2.setColor(c[j11]);
		int X11[] = { x1, x1 - 50, x1 - 100 };
		int Y11[] = { y1, y1 - 86, y1 };
		g2.drawPolygon(X11, Y11, 3);
		g2.fillPolygon(X11, Y11, 3);

		int j21 = rd.nextInt(6);
		do {
			j21 = rd.nextInt(6);
		} while (c[j21].toString().equals(c[j11].toString())
				|| c[j21].toString().equals(pixelColor62)
				|| c[j21].toString().equals(pixelColor10)
				|| c[j21].toString().equals(pixelColor26));
		pixelColor21 = c[j21].toString();
		g2.setColor(c[j21]);
		int X21[] = { x1, x1 - 50, x1 + 50 };
		int Y21[] = { y1, y1 - 86, y1 - 86 };
		g2.drawPolygon(X21, Y21, 3);
		g2.fillPolygon(X21, Y21, 3);

		int j61 = rd.nextInt(6);
		do {
			j61 = rd.nextInt(6);
		} while (c[j61].toString().equals(c[j11].toString())
				|| c[j61].toString().equals(c[j21].toString())
				|| c[j61].toString().equals(pixelColor62)
				|| c[j61].toString().equals(pixelColor10)
				|| c[j61].toString().equals(pixelColor26));
		pixelColor61 = c[j61].toString();
		g2.setColor(c[j61]);
		int X61[] = { x1, x1 - 50, x1 - 100 };
		int Y61[] = { y1, y1 + 86, y1 };
		g2.drawPolygon(X61, Y61, 3);
		g2.fillPolygon(X61, Y61, 3);
		
		int x3 = 562, y3 = 250;
		int j13 = rd.nextInt(6);
		do {
			j13 = rd.nextInt(6);
		} while (!c[j13].toString().equals(pixelColor42));
		g2.setColor(c[j13]);
		int X13[] = { x3, x3 - 50, x3 - 100 };
		int Y13[] = { y3, y3 - 86, y3 };
		g2.drawPolygon(X13, Y13, 3);
		g2.fillPolygon(X13, Y13, 3);

		int j53 = rd.nextInt(6);
		do {
			j53 = rd.nextInt(6);
		} while (!c[j53].toString().equals(pixelColor24));
		g2.setColor(c[j53]);
		int X53[] = { x3, x3 + 50, x3 - 50 };
		int Y53[] = { y3, y3 + 86, y3 + 86 };
		g2.drawPolygon(X53, Y53, 3);
		g2.fillPolygon(X53, Y53, 3);

		int j63 = rd.nextInt(6);
		do {
			j63 = rd.nextInt(6);
		} while (!c[j63].toString().equals(pixelColor30));
		g2.setColor(c[j63]);
		int X63[] = { x3, x3 - 50, x3 - 100 };
		int Y63[] = { y3, y3 + 86, y3 };
		g2.drawPolygon(X63, Y63, 3);
		g2.fillPolygon(X63, Y63, 3);

		int j33 = rd.nextInt(6);
		do {
			j33 = rd.nextInt(6);
		} while (c[j33].toString().equals(pixelColor42)
				|| c[j33].toString().equals(pixelColor24)
				|| c[j33].toString().equals(pixelColor30));
		pixelColor33 = c[j33].toString();
		g2.setColor(c[j33]);
		int X33[] = { x3, x3 + 50, x3 + 100 };
		int Y33[] = { y3, y3 - 86, y3 };
		g2.drawPolygon(X33, Y33, 3);
		g2.fillPolygon(X33, Y33, 3);

		int j43 = rd.nextInt(6);
		do {
			j43 = rd.nextInt(6);
		} while (c[j43].toString().equals(c[j33].toString())
				|| c[j43].toString().equals(pixelColor42)
				|| c[j43].toString().equals(pixelColor24)
				|| c[j43].toString().equals(pixelColor30));
		pixelColor43 = c[j43].toString();
		g2.setColor(c[j43]);
		int X43[] = { x3, x3 + 100, x3 + 50 };
		int Y43[] = { y3, y3, y3 + 86 };
		g2.drawPolygon(X43, Y43, 3);
		g2.fillPolygon(X43, Y43, 3);

		int j23 = rd.nextInt(6);
		do {
			j23 = rd.nextInt(6);
		} while (c[j23].toString().equals(c[j33].toString())
				|| c[j23].toString().equals(c[j43].toString())
				|| c[j23].toString().equals(pixelColor42)
				|| c[j23].toString().equals(pixelColor24)
				|| c[j23].toString().equals(pixelColor30)); // 最后一个色块随机取颜色并且满足不和前五个色块颜色相同的条件循环即停止
		pixelColor23 = c[j23].toString();
		g2.setColor(c[j23]);
		int X23[] = { x3, x3 - 50, x3 + 50 };
		int Y23[] = { y3, y3 - 86, y3 - 86 };
		g2.drawPolygon(X23, Y23, 3);
		g2.fillPolygon(X23, Y23, 3);

		int x5 = 390, y5 = 550;
		int j15 = rd.nextInt(6);
		do {
			j15 = rd.nextInt(6);
		} while (!c[j15].toString().equals(pixelColor46));
		g2.setColor(c[j15]);
		int X15[] = { x5, x5 - 50, x5 - 100 };
		int Y15[] = { y5, y5 - 86, y5 };
		g2.drawPolygon(X15, Y15, 3);
		g2.fillPolygon(X15, Y15, 3);

		int j25 = rd.nextInt(6);
		do {
			j25 = rd.nextInt(6);
		} while (!c[j25].toString().equals(pixelColor50));
		g2.setColor(c[j25]);
		int X25[] = { x5, x5 - 50, x5 + 50 };
		int Y25[] = { y5, y5 - 86, y5 - 86 };
		g2.drawPolygon(X25, Y25, 3);
		g2.fillPolygon(X25, Y25, 3);

		int j35 = rd.nextInt(6);
		do {
			j35 = rd.nextInt(6);
		} while (!c[j35].toString().equals(pixelColor64));
		g2.setColor(c[j35]);
		int X35[] = { x5, x5 + 50, x5 + 100 };
		int Y35[] = { y5, y5 - 86, y5 };
		g2.drawPolygon(X35, Y35, 3);
		g2.fillPolygon(X35, Y35, 3);

		int j45 = rd.nextInt(6);
		do {
			j45 = rd.nextInt(6);
		} while (c[j45].toString().equals(pixelColor46)
				|| c[j45].toString().equals(pixelColor50)
				|| c[j45].toString().equals(pixelColor64));
		pixelColor45 = c[j45].toString();
		g2.setColor(c[j45]);
		int X45[] = { x5, x5 + 100, x5 + 50 };
		int Y45[] = { y5, y5, y5 + 86 };
		g2.drawPolygon(X45, Y45, 3);
		g2.fillPolygon(X45, Y45, 3);

		int j55 = rd.nextInt(6);
		do {
			j55 = rd.nextInt(6);
		} while (c[j55].toString().equals(c[j45].toString())
				|| c[j55].toString().equals(pixelColor46)
				|| c[j55].toString().equals(pixelColor50)
				|| c[j55].toString().equals(pixelColor64));
		pixelColor55 = c[j55].toString();
		g2.setColor(c[j55]);
		int X55[] = { x5, x5 + 50, x5 - 50 };
		int Y55[] = { y5, y5 + 86, y5 + 86 };
		g2.drawPolygon(X55, Y55, 3);
		g2.fillPolygon(X55, Y55, 3);

		int j65 = rd.nextInt(6);
		do {
			j65 = rd.nextInt(6);
		} while (c[j65].toString().equals(c[j45].toString())
				|| c[j65].toString().equals(c[j55].toString())
				|| c[j65].toString().equals(pixelColor46)
				|| c[j65].toString().equals(pixelColor50)
				|| c[j65].toString().equals(pixelColor64));
		pixelColor65 = c[j65].toString();
		g2.setColor(c[j65]);
		int X65[] = { x5, x5 - 50, x5 - 100 };
		int Y65[] = { y5, y5 + 86, y5 };
		g2.drawPolygon(X65, Y65, 3);
		g2.fillPolygon(X65, Y65, 3);
//		pintu();
	}

//	private void pintu() {
//		
//		
//		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		Graphics2D g2 = (Graphics2D) drawPan.getGraphics();
//		
//		int x1 = 315, y1 = 307;
//		int j31 = rd.nextInt(6);
//		do {
//			j31 = rd.nextInt(6);
//		} while (!c[j31].toString().equals(pixelColor62)); // 对应色块颜色相同后取颜色随机函数循环停止颜色固定不变
//		g2.setColor(c[j31]);
//		int X31[] = { x1, x1 + 25, x1 + 50 };
//		int Y31[] = { y1, y1 - 43, y1 };
//		g2.drawPolygon(X31, Y31, 3);
//		g2.fillPolygon(X31, Y31, 3);
//
//		int j41 = rd.nextInt(6);
//		do {
//			j41 = rd.nextInt(6);
//		} while (!c[j41].toString().equals(pixelColor10));
//		g2.setColor(c[j41]);
//		int X41[] = { x1, x1 + 50, x1 + 25 };
//		int Y41[] = { y1, y1, y1 + 43 };
//		g2.drawPolygon(X41, Y41, 3);
//		g2.fillPolygon(X41, Y41, 3);
//
//		int j51 = rd.nextInt(6);
//		do {
//			j51 = rd.nextInt(6);
//		} while (!c[j51].toString().equals(pixelColor26));
//		g2.setColor(c[j51]);
//		int X51[] = { x1, x1 + 25, x1 - 25 };
//		int Y51[] = { y1, y1 + 43, y1 + 43 };
//		g2.drawPolygon(X51, Y51, 3);
//		g2.fillPolygon(X51, Y51, 3);
//
//		int j11 = rd.nextInt(6);
//		do {
//			j11 = rd.nextInt(6);
//		} while (!c[j11].toString().equals(pixelColor11));
//		g2.setColor(c[j11]);
//		int X11[] = { x1, x1 - 25, x1 - 50 };
//		int Y11[] = { y1, y1 - 43, y1 };
//		g2.drawPolygon(X11, Y11, 3);
//		g2.fillPolygon(X11, Y11, 3);
//
//		int j21 = rd.nextInt(6);
//		do {
//			j21 = rd.nextInt(6);
//		} while (!c[j21].toString().equals(pixelColor21));
//		g2.setColor(c[j21]);
//		int X21[] = { x1, x1 - 25, x1 + 25 };
//		int Y21[] = { y1, y1 - 43, y1 - 43 };
//		g2.drawPolygon(X21, Y21, 3);
//		g2.fillPolygon(X21, Y21, 3);
//
//		int j61 = rd.nextInt(6);
//		do {
//			j61 = rd.nextInt(6);
//		} while (!c[j61].toString().equals(pixelColor61));
//		g2.setColor(c[j61]);
//		int X61[] = { x1, x1 - 25, x1 - 50 };
//		int Y61[] = { y1, y1 + 43, y1 };
//		g2.drawPolygon(X61, Y61, 3);
//		g2.fillPolygon(X61, Y61, 3);
//
//		int x3 = 465, y3 = 307;
//		int j13 = rd.nextInt(6);
//		do {
//			j13 = rd.nextInt(6);
//		} while (!c[j13].toString().equals(pixelColor42));
//		g2.setColor(c[j13]);
//		int X13[] = { x3, x3 - 25, x3 - 50 };
//		int Y13[] = { y3, y3 - 43, y3 };
//		g2.drawPolygon(X13, Y13, 3);
//		g2.fillPolygon(X13, Y13, 3);
//
//		int j53 = rd.nextInt(6);
//		do {
//			j53 = rd.nextInt(6);
//		} while (!c[j53].toString().equals(pixelColor24));
//		g2.setColor(c[j53]);
//		int X53[] = { x3, x3 + 25, x3 - 25 };
//		int Y53[] = { y3, y3 + 43, y3 + 43 };
//		g2.drawPolygon(X53, Y53, 3);
//		g2.fillPolygon(X53, Y53, 3);
//
//		int j63 = rd.nextInt(6);
//		do {
//			j63 = rd.nextInt(6);
//		} while (!c[j63].toString().equals(pixelColor30));
//		g2.setColor(c[j63]);
//		int X63[] = { x3, x3 - 25, x3 - 50 };
//		int Y63[] = { y3, y3 + 43, y3 };
//		g2.drawPolygon(X63, Y63, 3);
//		g2.fillPolygon(X63, Y63, 3);
//
//		int j33 = rd.nextInt(6);
//		do {
//			j33 = rd.nextInt(6);
//		} while (!c[j33].toString().equals(pixelColor33));
//		g2.setColor(c[j33]);
//		int X33[] = { x3, x3 + 25, x3 + 50 };
//		int Y33[] = { y3, y3 - 43, y3 };
//		g2.drawPolygon(X33, Y33, 3);
//		g2.fillPolygon(X33, Y33, 3);
//
//		int j43 = rd.nextInt(6);
//		do {
//			j43 = rd.nextInt(6);
//		} while (!c[j43].toString().equals(pixelColor43));
//		g2.setColor(c[j43]);
//		int X43[] = { x3, x3 + 50, x3 + 25 };
//		int Y43[] = { y3, y3, y3 + 43 };
//		g2.drawPolygon(X43, Y43, 3);
//		g2.fillPolygon(X43, Y43, 3);
//
//		int j23 = rd.nextInt(6);
//		do {
//			j23 = rd.nextInt(6);
//		} while (!c[j23].toString().equals(pixelColor23)); 
//		g2.setColor(c[j23]);
//		int X23[] = { x3, x3 - 25, x3 + 25 };
//		int Y23[] = { y3, y3 - 43, y3 - 43 };
//		g2.drawPolygon(X23, Y23, 3);
//		g2.fillPolygon(X23, Y23, 3);
//		
//		
//		int x5 = 390, y5 = 436;
//		int j15 = rd.nextInt(6);
//		do {
//			j15 = rd.nextInt(6);
//		} while (!c[j15].toString().equals(pixelColor46));
//		g2.setColor(c[j15]);
//		int X15[] = { x5, x5 - 25, x5 - 50 };
//		int Y15[] = { y5, y5 - 43, y5 };
//		g2.drawPolygon(X15, Y15, 3);
//		g2.fillPolygon(X15, Y15, 3);
//
//		int j25 = rd.nextInt(6);
//		do {
//			j25 = rd.nextInt(6);
//		} while (!c[j25].toString().equals(pixelColor50));
//		g2.setColor(c[j25]);
//		int X25[] = { x5, x5 - 25, x5 + 25 };
//		int Y25[] = { y5, y5 - 43, y5 - 43 };
//		g2.drawPolygon(X25, Y25, 3);
//		g2.fillPolygon(X25, Y25, 3);
//
//		int j35 = rd.nextInt(6);
//		do {
//			j35 = rd.nextInt(6);
//		} while (!c[j35].toString().equals(pixelColor64));
//		g2.setColor(c[j35]);
//		int X35[] = { x5, x5 + 25, x5 + 50 };
//		int Y35[] = { y5, y5 - 43, y5 };
//		g2.drawPolygon(X35, Y35, 3);
//		g2.fillPolygon(X35, Y35, 3);
//
//		int j45 = rd.nextInt(6);
//		do {
//			j45 = rd.nextInt(6);
//		} while (!c[j45].toString().equals(pixelColor45));
//		g2.setColor(c[j45]);
//		int X45[] = { x5, x5 + 50, x5 + 25 };
//		int Y45[] = { y5, y5, y5 + 43 };
//		g2.drawPolygon(X45, Y45, 3);
//		g2.fillPolygon(X45, Y45, 3);
//
//		int j55 = rd.nextInt(6);
//		do {
//			j55 = rd.nextInt(6);
//		} while (!c[j55].toString().equals(pixelColor55));
//		g2.setColor(c[j55]);
//		int X55[] = { x5, x5 + 25, x5 - 25 };
//		int Y55[] = { y5, y5 + 43, y5 + 43 };
//		g2.drawPolygon(X55, Y55, 3);
//		g2.fillPolygon(X55, Y55, 3);
//
//		int j65 = rd.nextInt(6);
//		do {
//			j65 = rd.nextInt(6);
//		} while (!c[j65].toString().equals(pixelColor65));
//		g2.setColor(c[j65]);
//		int X65[] = { x5, x5 - 25, x5 - 50 };
//		int Y65[] = { y5, y5 + 43, y5 };
//		g2.drawPolygon(X65, Y65, 3);
//		g2.fillPolygon(X65, Y65, 3);
		
//		int x2 = 390, y2 = 294;
//		int j32 = rd.nextInt(6);
//		do {
//			j32 = rd.nextInt(6);
//		} while (c[j32].toString().equals(pixelColor32));
//		g2.setColor(c[j32]);
//		int X32[] = { x1, x1 + 25, x1 + 50 };
//		int Y32[] = { y1, y1 - 43, y1 };
//		g2.drawPolygon(X32, Y32, 3);
//		g2.fillPolygon(X32, Y32, 3);
//
//		int j42 = rd.nextInt(6);
//		do {
//			j42 = rd.nextInt(6);
//		} while (c[j42].toString().equals(pixelColor42));
//		g2.setColor(c[j42]);
//		int X42[] = { x1, x1 + 50, x1 + 25 };
//		int Y42[] = { y1, y1, y1 + 43 };
//		g2.drawPolygon(X42, Y42, 3);
//		g2.fillPolygon(X42, Y42, 3);
//
//		int j52 = rd.nextInt(6);
//		do {
//			j52 = rd.nextInt(6);
//		} while (!c[j52].toString().equals(pixelColor52));
//		g2.setColor(c[j52]);
//		int X52[] = { x1, x1 + 25, x1 - 25 };
//		int Y52[] = { y1, y1 + 43, y1 + 43 };
//		g2.drawPolygon(X52, Y52, 3);
//		g2.fillPolygon(X52, Y52, 3);
//
//		int j12 = rd.nextInt(6);
//		do {
//			j12 = rd.nextInt(6);
//		} while (!c[j12].toString().equals(pixelColor12));
//		pixelColor11 = c[j12].toString();
//		g2.setColor(c[j12]);
//		int X12[] = { x1, x1 - 25, x1 - 50 };
//		int Y12[] = { y1, y1 - 43, y1 };
//		g2.drawPolygon(X12, Y12, 3);
//		g2.fillPolygon(X12, Y12, 3);
//
//		int j22 = rd.nextInt(6);
//		do {
//			j22 = rd.nextInt(6);
//		} while (!c[j22].toString().equals(pixelColor22));
//		pixelColor21 = c[j22].toString();
//		g2.setColor(c[j22]);
//		int X22[] = { x1, x1 - 25, x1 + 25 };
//		int Y22[] = { y1, y1 - 43, y1 - 43 };
//		g2.drawPolygon(X22, Y22, 3);
//		g2.fillPolygon(X22, Y22, 3);
//
//		int j62 = rd.nextInt(6);
//		do {
//			j62 = rd.nextInt(6);
//		} while (!c[j62].toString().equals(pixelColor62));
//		pixelColor61 = c[j62].toString();
//		g2.setColor(c[j62]);
//		int X62[] = { x1, x1 - 25, x1 - 50 };
//		int Y62[] = { y1, y1 + 43, y1 };
//		g2.drawPolygon(X62, Y62, 3);
//		g2.fillPolygon(X62, Y62, 3);
//	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
