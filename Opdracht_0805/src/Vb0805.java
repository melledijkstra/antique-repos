import javafx.scene.control.*;
import sun.awt.image.IntegerComponentRaster;

import javax.swing.*;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by melle_000 on 2015-11-24.
 */
public class Vb0805 extends JFrame {
    public static void main(String srgs[]) {
        JFrame frame = new JFrame();
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Voorbeeld 0805 Staafdiagram");
        frame.setContentPane(new TekenPaneel());
        frame.setVisible(true);
    }
}

class TekenPaneel extends JPanel {
    private TextField inputField;
    private Staafdiagram staafdiagram = null;

    public TekenPaneel() {
        inputField = new TextField(20);
        int maxInput = 190;
        inputField.addActionListener(e -> {
            String[] aParts = inputField.getText().trim().split(",");
            ArrayList<Integer> aNumbers = new ArrayList<>();
            for(String part : aParts) {
                int _number = Integer.parseInt(part);
                if(_number < maxInput) {
                    aNumbers.add(_number);
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), _number+" is to big (max is "+maxInput+")");
                }
                System.out.println(Integer.parseInt(part));
            }
            this.staafdiagram = new Staafdiagram(aNumbers.toArray(new Integer[aNumbers.size()]),30);
            this.repaint();
        });
        this.add(inputField);
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(staafdiagram != null) {
            staafdiagram.tekenMaxMin(g, 70, 250);
        }
    }
}

class Staafdiagram {
    private Integer[] lengtes;
    private int witruimte;

    public Staafdiagram(Integer[] lengtes,int witruimte) {
        this.lengtes = lengtes;
        this.witruimte = witruimte;
    }

    public void teken(Graphics g, int x, int y) {
        int startX = x;

        // teken de staven
        for (int lengte : lengtes) {
            g.fillRect(x,y - 20 - lengte,20,lengte);
            x += witruimte;
        }

        // zet de getallen onder de stafen
        x = startX;
        for(int lengte : lengtes) {
            g.drawString(String.format("%d",lengte),x,y);
            x += witruimte;
        }
    }

    public void tekenMaxMin(Graphics g,int x, int y) {
        int startX = x;
        int max = this.max(lengtes);
        int min = this.min(lengtes);

        // teken de staven
        for (int lengte : lengtes) {
            if(lengte == max) {
                g.setColor(Color.BLUE);
            } else if(lengte == min) {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.BLACK);
            }

            g.fillRect(x,y - 20 - lengte,20,lengte);

            x += witruimte;
        }

        g.setColor(Color.BLACK);
        // zet de getallen onder de stafen
        x = startX;
        for(int lengte : lengtes) {
            g.drawString(String.format("%d",lengte),x,y);
            x += witruimte;
        }
    }

    public int max(Integer[] a) {
        int maximum = 0;
        for(int b : a) {
            if(b > maximum)
                maximum = b;
        }
        return maximum;
    }

    public int min(Integer[] a) {
        int min = max(a);
        for(int b : a) {
            if(b < min)
                min = b;
        }
        return min;
    }
}