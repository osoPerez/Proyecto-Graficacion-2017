package vista.figurasTrazos;

import control.AccionBotonDibujarCirculo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import vista.PanelCuadricula;

public class VentanaCirculo extends JPanel{
    public PanelCuadricula panel1;
    public PanelCuadricula panel2;
    public JTextField fieldRadio;
    public ButtonGroup grupo;
    public JRadioButton radioBtnNormal;
    public JRadioButton radioBtnGruesa;
    public JRadioButton radioBtnSegmentada;
    
    public VentanaCirculo() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800, 500);
        //setLocationRelativeTo(null);

        JLabel titulo = new JLabel("PROYECTO DE GRAFICACIÓN - CIRCUNFERENCIA");
        titulo.setBounds(200, 0, 400, 50);  
        titulo.setFont(new Font("Tahoma", 3, 15));
        titulo.setForeground(Color.ORANGE);
        this.add(titulo);
        
        JLabel titulo1 = new JLabel("Algoritmo de Bresenham");
        titulo1.setBounds(100,50,200,50); 
        titulo1.setFont(new Font("Arial", 3, 15));
        titulo1.setForeground(Color.WHITE);
        this.add(titulo1); 
        
        JLabel titulo2 = new JLabel("Algoritmo de Coordenadas Polares");
        titulo2.setBounds(430,50,280,50); 
        titulo2.setFont(new Font("Arial", 3, 15));
        titulo2.setForeground(Color.WHITE);
        this.add(titulo2); 
        
        panel1 = new PanelCuadricula();
        panel1.setLocation(50, 90);
        add(panel1);
        
        panel2 = new PanelCuadricula();
        panel2.setLocation(420, 90);
        add(panel2);
        
        JLabel label1 = new JLabel("Radio");
        label1.setBounds(70,380,70,25);
        label1.setForeground(Color.WHITE);
        this.add(label1);
        
        fieldRadio = new JTextField("5");
        fieldRadio.setBounds(70,400,50,25);
        this.add(fieldRadio);
        
        JButton boton1 = new JButton("Dibujar");
        boton1.setBounds(130, 400, 80, 25);
        boton1.setForeground(Color.white);//color de la letra
        boton1.setBackground(Color.GREEN);//color boton
        boton1.addActionListener(new AccionBotonDibujarCirculo(this));
        this.add(boton1);
        //-----------------------------------------------------------------------
        Font fuente = new Font("TimesRoman", 3, 8);
        JLabel x = new JLabel("0"); 
        x.setBounds(182,360,20,20); 
        x.setFont(fuente); x.setForeground(Color.WHITE);
        this.add(x);
        int a=193;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel(""+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(a,365,15,10); this.add(x1); x1.setFont(fuente); 
             a += 11;
        }
        int b=171;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel("-"+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(b,365,15,10); this.add(x1); x1.setFont(fuente); 
             b -= 11;
        }
        JLabel y = new JLabel("0"); 
        y.setForeground(Color.WHITE);
        y.setBounds(555,360,20,20); 
        y.setFont(fuente);
        this.add(y);
        
        int e=566;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel(""+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(e,365,15,10); this.add(x1); x1.setFont(fuente); 
             e += 11;
        }
        int f=541;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel("-"+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(f,365,15,10); this.add(x1); x1.setFont(fuente); 
             f -= 11;
        }     
        //----------------------------------------------------------------------
        int c=211;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel(""+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(41,c,15,10); this.add(x1); x1.setFont(fuente);
             c -= 11;
        }
        int d=234;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel("-"+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(38,d,15,10); this.add(x1); x1.setFont(fuente); 
             d += 11;
        }
        int g=210;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel(""+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(411,g,15,10); this.add(x1); x1.setFont(fuente);
             g -= 11;
        }
        int h=234;
        for (int i = 1; i < 13; i++) {
             JLabel x1 = new JLabel("-"+i+"");  
             x1.setForeground(Color.WHITE);
             x1.setBounds(408,h,15,10); this.add(x1); x1.setFont(fuente); 
             h += 11;
        }
        
        JLabel x1 = new JLabel("0");  x1.setBounds(41,217,20,20); x1.setFont(fuente);this.add(x1);
        x1.setForeground(Color.WHITE);
        
        JLabel y1 = new JLabel("0"); y1.setBounds(411,217,20,20); y1.setFont(fuente);this.add(y1);
        y1.setForeground(Color.WHITE);

        radioBtnNormal=new JRadioButton("Linea Normal");
        radioBtnNormal.setForeground(Color.WHITE);
        radioBtnNormal.setContentAreaFilled(false);
        radioBtnNormal.setBounds(230,400,120,30);
        radioBtnNormal.setSelected(true);
        this.add(radioBtnNormal);
        radioBtnGruesa=new JRadioButton("Linea Gruesa");
        radioBtnGruesa.setForeground(Color.WHITE);
        radioBtnGruesa.setContentAreaFilled(false);
        radioBtnGruesa.setBounds(355,400,150,30);
        this.add(radioBtnGruesa);
        radioBtnSegmentada=new JRadioButton("Linea Segmentada");
        radioBtnSegmentada.setForeground(Color.WHITE);
        radioBtnSegmentada.setContentAreaFilled(false);
        radioBtnSegmentada.setBounds(480,400,150,30);
        this.add(radioBtnSegmentada);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBtnNormal);
        grupo.add(radioBtnGruesa);
        grupo.add(radioBtnSegmentada);
        //add(grupo);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, getWidth(), getHeight());
        panel.setBackground(new Color(80, 80, 80));
        add(panel);
        setVisible(true);
    }

    public PanelCuadricula getPanel1() {
        return panel1;
    }
    
    public PanelCuadricula getPanel2() {
        return panel2;
    }
    
}
