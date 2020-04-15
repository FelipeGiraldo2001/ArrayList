
package cine;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Giraldo
 */
public class Interfaz extends JFrame  implements ActionListener//clasw shape da forma a la interfaz
{ 
    JLabel l1, l2, l3, l4, l5, l6,l7, l8, l9,l10, l11, l12;
    JPanel p1,p2, p3,p4, p5,p6, p7, p8, p9, p10, p11, p12; //agregar cuadros
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10, b11, b12; //agregar botón
    JTextField t1, t2, t3, t4, t5, t6, t7,t8,t9, t10;
    int acum=0;
    public Interfaz()
    {
        
         Pelicula ironMan=new Pelicula("Iron Man"," Jon Favreau\n",2008 );
       Pelicula bohemianRhapsody=new Pelicula(" Bohemian Rhapsody: La historia de Freddy Mercury\n"," Bryan Singer\n",
            2018);
      Pelicula avengers=new Pelicula("Avenger: EndGame\n","Joe Russo y Anthony Russo\n", 2019);
      Pelicula whyHim=new Pelicula("¿Por qué el?\n","John Hamburg\n", 2016);
      Pelicula elPlanetaSimios=new Pelicula("El planeta de los simios (R)evolución\n","Rupert Wyatt\n", 2011);
      Pelicula residentEvil=new Pelicula("Resident Evil: cápitulo final\n","Paul W. S. Anderson\n",2016);
      Pelicula blackWidow=new Pelicula("Black Widow\n","Cate Shortland\n", 2020);
      Pelicula sing=new Pelicula("Sing: ¡ven y canta!\n","Garth Jennings\n", 2016);
      Pelicula deadPool=new Pelicula("Deadpool 2\n","David Leitch\n", 2018);
      Pelicula elConjuro=new Pelicula("El conjuro 3\n","Michael Chaves\n", 2020);
      
      //Se define el ArrayList
       ArrayList<Pelicula> lista = new ArrayList<>();
       
       // Agregamos estas instancias al ArrayList con el método add 
        lista.add(ironMan); 
        lista.add(bohemianRhapsody); 
        lista.add(avengers); 
        lista.add(whyHim); 
        lista.add(elPlanetaSimios); 
        lista.add(residentEvil); 
        lista.add(blackWidow); 
        lista.add(sing);
        lista.add(deadPool); 
        lista.add(elConjuro); 
        setBounds(250,150, 900, 500);
        setLayout(new FlowLayout());
        p1=new JPanel(); 
        l1= new JLabel(lista.get(0).toString());
        t1=new JTextField(5);
        p1.setBackground(Color.green);
        b1=new JButton("Vender Entradas: Iron Man");
        b1.addActionListener(this); //agregar acción al botón
        b1.setActionCommand("Vender Entradas: Iron Man");
        p1.add(l1);
        p1.add(t1);
        p1.add(b1); 
        add(p1,BorderLayout.WEST);
        p2=new JPanel();
        l2=new JLabel(lista.get(1).toString());
        t2=new JTextField(5);
        p2.setBackground(Color.green);
        b2=new JButton("Vender Entradas: Bohemian Rhapsody");
        b2.addActionListener(this); //agregar acción al botón
        b2.setActionCommand("Vender Entradas: Bohemian Rhapsody");
        p2.add(l2);
        p2.add(t2);
        p2.add(b2);
        add(p2, BorderLayout.WEST);
        p3=new JPanel();
        l3=new JLabel(lista.get(2).toString());
        t3=new JTextField(5);
        p3.setBackground(Color.green);
        b3=new JButton("Vender Entradas: Avengers");
        b3.addActionListener(this); //agregar acción al botón
        b3.setActionCommand("Vender Entradas: Avengers");
        p3.add(l3);
        p3.add(t3);
        p3.add(b3);
        add(p3,BorderLayout.BEFORE_LINE_BEGINS);
        p4=new JPanel();
        l4=new JLabel(lista.get(3).toString());
        t4=new JTextField(5);
        p4.setBackground(Color.green);
        b4=new JButton("Vender Entradas:¿Por que el?");
        b4.addActionListener(this); //agregar acción al botón
        b4.setActionCommand("Vender Entradas:¿Por que el?");
        p4.add(l4);
        p4.add(t4);
        p4.add(b4);
        add(p4,BorderLayout.BEFORE_LINE_BEGINS);
        p5=new JPanel();
        l5=new JLabel(lista.get(4).toString());
        t5=new JTextField(5);
        p5.setBackground(Color.green);
        b5=new JButton("Vender Entradas: El planeta");
        b5.addActionListener(this); //agregar acción al botón
        b5.setActionCommand("Vender Entradas: El planeta");
        p5.add(l5);
        p5.add(t5);
        p5.add(b5);
        add(p5,BorderLayout.BEFORE_LINE_BEGINS);
        p6=new JPanel();
        l6=new JLabel(lista.get(5).toString());
        t6=new JTextField(5);
        p6.setBackground(Color.green);
        b6=new JButton("Vender Entradas: Resident evil");
        b6.addActionListener(this); //agregar acción al botón
        b6.setActionCommand("Vender Entradas: Resident evil");
        p6.add(l6);
        p6.add(t6);
        p6.add(b6);
        add(p6,BorderLayout.BEFORE_LINE_BEGINS);
        p7=new JPanel();
        l7=new JLabel(lista.get(6).toString());
        t7=new JTextField(5);
        p7.setBackground(Color.green);
        b7=new JButton("Vender Entradas: Black Widow");
        b7.addActionListener(this); //agregar acción al botón
        b7.setActionCommand("Vender Entradas: Black Widow");
        p7.add(l7);
        p7.add(t7);
        p7.add(b7);
        add(p7,BorderLayout.BEFORE_LINE_BEGINS);
        p8=new JPanel();
        l8=new JLabel(lista.get(7).toString());
        t8=new JTextField(5);
        p8.setBackground(Color.green);
        b8=new JButton("Vender Entradas: Sing");
        b8.addActionListener(this); //agregar acción al botón
        b8.setActionCommand("Vender Entradas: Sing");
        p8.add(l8);
        p8.add(t8);
        p8.add(b8);
        add(p8,BorderLayout.BEFORE_LINE_BEGINS);
        p9=new JPanel();
        l9=new JLabel(lista.get(8).toString());
        t9=new JTextField(5);
        p9.setBackground(Color.green);
         b9=new JButton("Vender Entradas: DeadPool");
        b9.addActionListener(this); //agregar acción al botón
        b9.setActionCommand("Vender Entradas: DeadPool");
        p9.add(l9);
        p9.add(t9);
        p9.add(b9);
        add(p9,BorderLayout.BEFORE_LINE_BEGINS);
        p10=new JPanel();
        l10=new JLabel(lista.get(9).toString());
        t10=new JTextField(5);
        p10.setBackground(Color.green);
        b10=new JButton("Vender Entradas: El conjuro");
        b10.addActionListener(this); //agregar acción al botón
        b10.setActionCommand("Vender Entradas: El conjuro");
        p10.add(l10);
        p10.add(t10);
        p10.add(b10);
        add(p10,BorderLayout.WEST);
        p11=new JPanel();
        l11=new JLabel("Total de entradas vendidas");
        p11.setBackground(Color.yellow);
        b11=new JButton("Calcular");
        b11.addActionListener(this); //agregar acción al botón
        b11.setActionCommand("Calcular");
        p11.add(l11);
        p11.add(b11);
        add(p11,BorderLayout.WEST);
        p12=new JPanel();
        l12=new JLabel("Total de entradas vendidas");
        p12.setBackground(Color.yellow);
        b12=new JButton("Vaciar");
        b12.addActionListener(this); //agregar acción al botón
        b12.setActionCommand("Vaciar");
        p12.add(l12);
        p12.add(b12);
        add(p12,BorderLayout.WEST);
        setVisible(true);
    }

   @Override
      public void actionPerformed(ActionEvent ae) 
    {
        int valor, tot;
     
        if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: Iron Man"))
        {
           valor=Integer.parseInt(t1.getText());
           acum+=valor;
           
        }
         if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: Bohemian Rhapsody"))
        {
           valor=Integer.parseInt(t2.getText());
           acum+=valor;
        }
          if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: Avengers"))
        {
           valor=Integer.parseInt(t3.getText());
           acum+=valor;
        }
           if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas:¿Por que el?"))
        {
           valor=Integer.parseInt(t4.getText());
           acum+=valor;
        }
            if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: El planeta"))
        {
           valor=Integer.parseInt(t5.getText());
           acum+=valor;
        }
             if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: Resident evil"))
        {
           valor=Integer.parseInt(t6.getText());
           acum+=valor;
        }
              if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: Black Widow"))
        {
           valor=Integer.parseInt(t7.getText());
           acum+=valor;
        }
               if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: Sing"))
        {
           valor=Integer.parseInt(t8.getText());
           acum+=valor;
        }
                if(ae.getActionCommand().equalsIgnoreCase("Vender Entradas: El conjuro"))
        {
           valor=Integer.parseInt(t9.getText());
           acum+=valor;
        }
                 if(ae.getActionCommand().equalsIgnoreCase("Total de entradas vendidas"))
        {
           valor=Integer.parseInt(t10.getText());
           acum+=valor;
        } 
          if(ae.getActionCommand().equalsIgnoreCase("Calcular")){
        
              tot=acumulado(acum);
                JOptionPane.showMessageDialog(null,"El total de entradas vendidas es:" + tot );
          }
           if(ae.getActionCommand().equalsIgnoreCase("Vaciar"))
           {
               acum=0;
           }
    }
      
      public int acumulado(int ac)
      {
          return ac;
      }
     
    
     
}
