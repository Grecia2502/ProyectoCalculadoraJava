/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoragraficabasica;

/**
 *
 * @author arace
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculadoraGraficaBasica extends JFrame implements ActionListener {
    private JTextField campoTexto; // Campo para mostrar los números 
    private String operador; // Almacena el operador seleccionado (+, -, *, /)
    private double numero1, numero2; // Almacena los operandos

    public CalculadoraGraficaBasica() {
        setTitle("Calculadora Básica");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Campo de texto para mostrar los números y resultados
        campoTexto = new JTextField();
        campoTexto.setHorizontalAlignment(JTextField.RIGHT);
        campoTexto.setEditable(false);
        add(campoTexto, BorderLayout.NORTH);

        // Panel para los botones
JPanel panelBotones = new JPanel();
panelBotones.setLayout(new GridLayout(4, 4, 5, 5));

// Crear botones de números y operaciones de forma manual
JButton boton7 = new JButton("7");
boton7.addActionListener(this);
panelBotones.add(boton7);
   
        
JButton boton8 = new JButton("8");
boton8.addActionListener(this);
panelBotones.add(boton8);

JButton boton9 = new JButton("9");
boton9.addActionListener(this);
panelBotones.add(boton9);

JButton botonDividir = new JButton("/");
botonDividir.addActionListener(this);
panelBotones.add(botonDividir);

JButton boton4 = new JButton("4");
boton4.addActionListener(this);
panelBotones.add(boton4);

JButton boton5 = new JButton("5");
boton5.addActionListener(this);
panelBotones.add(boton5);

JButton boton6 = new JButton("6");
boton6.addActionListener(this);
panelBotones.add(boton6);

JButton botonMultiplicar = new JButton("*");
botonMultiplicar.addActionListener(this);
panelBotones.add(botonMultiplicar);

JButton boton1 = new JButton("1");
boton1.addActionListener(this);
panelBotones.add(boton1);

JButton boton2 = new JButton("2");
boton2.addActionListener(this);
panelBotones.add(boton2);

JButton boton3 = new JButton("3");
boton3.addActionListener(this);
panelBotones.add(boton3);

JButton botonRestar = new JButton("-");
botonRestar.addActionListener(this);
panelBotones.add(botonRestar);

JButton boton0 = new JButton("0");
boton0.addActionListener(this);
panelBotones.add(boton0);

JButton botonClear = new JButton("C");
botonClear.addActionListener(this);
panelBotones.add(botonClear);

JButton botonIgual = new JButton("=");
botonIgual.addActionListener(this);
panelBotones.add(botonIgual);

JButton botonSumar = new JButton("+");
botonSumar.addActionListener(this);
panelBotones.add(botonSumar);

// Añadir el panel de botones al contenedor principal
add(panelBotones, BorderLayout.CENTER);

        // Configurar ventana
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        // Si se presiona un número lee el valor de la accion 
        if ("0123456789".contains(comando)) {
            campoTexto.setText(campoTexto.getText() + comando); //acumula en el campoTexto lo que se valla presionando
        } 

        // Si se presiona "C" (clear) para borrar lo capturado
        else if ("C".equals(comando)) {
            campoTexto.setText("");
            numero1 = numero2 = 0;
            operador = "";
        }
    }

    public static void main(String[] args) {
        new CalculadoraGraficaBasica();
    }
    
}
