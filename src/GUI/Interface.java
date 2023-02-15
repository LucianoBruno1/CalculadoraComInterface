package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {
    private JButton btnPorcentagem;
    private JButton btnApagar;
    private JButton btnCE;
    private JButton btnC;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDiv;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMult;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSoma;
    private JButton btnVirgula;
    private JButton btn0;
    private JButton btnIgual;
    private JButton btnSub;
    private JPanel contentPane;
    private JPanel painelResultado;
    private JLabel lblTexto;
    private JButton a1XButton;
    private JButton btnNegativo;
    private JButton Xquadrado;
    private JButton btnRaiz;

//    private Controller controller;
//    private EnumOperacao ultimaOperacao;

    private double num1;
    private double num2;
    private double resultado;
    private String operacao;



    public Interface() {
//        controller = new Controller();

        setContentPane(contentPane);
        setTitle("CALCULADORA DESKTOP");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                digita("0");
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                digita("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digita("2");
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                digita("3");
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digita("4");

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                digita("5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digita("6");
            }
        });


        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digita("7");

            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digita("8");

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            digita("9");
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {

                    num1 = Double.parseDouble(lblTexto.getText());
                    operacao = "subtracao";
                    lblTexto.setText("");
                }

            }
        });
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {

                    num1 = Double.parseDouble(lblTexto.getText());
                    operacao = "soma";
                    lblTexto.setText("");
                }

            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {

                    num1 = Double.parseDouble(lblTexto.getText());
                    operacao = "multiplicacao";
                    lblTexto.setText("");
                }

            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {

                    num1 = Double.parseDouble(lblTexto.getText());
                    operacao = "divisao";
                    lblTexto.setText("");
                }

            }
        });

        btnVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digita(".");
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lblTexto.getText().isEmpty() || lblTexto.getText().equals(".")){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                } else {
                    num2 = Double.parseDouble(lblTexto.getText());

                    if(operacao.equals("soma")){
                        resultado = num1 + num2;
                        lblTexto.setText(String.valueOf(resultado));

                    } else if(operacao.equals("subtracao")){
                        resultado = num1 - num2;
                        lblTexto.setText(String.valueOf(resultado));

                    }else if(operacao.equals("multiplicacao")){
                        resultado = num1 * num2;
                        lblTexto.setText(String.valueOf(resultado));

                    }else if(operacao.equals("divisao")){
                        resultado = num1 / num2;
                        lblTexto.setText(String.valueOf(resultado));
                    }
                }
            }
        });

        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTexto.setText("");

            }
        });
        btnCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTexto.setText("");
                num1 = 0;
                num2 = 0;
                operacao = "";


            }
        });
        btnPorcentagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {
                    num1 = Double.parseDouble(lblTexto.getText());
                    resultado = num1 / 100;
                    lblTexto.setText(String.valueOf(resultado));
                }
            }
        });


        btnNegativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num1 *= -1;
                lblTexto.setText(String.valueOf(num1));


            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {

                    num1 = Double.parseDouble(lblTexto.getText());
                    resultado = 1 / num1;
                    lblTexto.setText(String.valueOf(resultado));

                }

            }
        });
        Xquadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {
                    num1 = Double.parseDouble(lblTexto.getText());
                    resultado = num1 * num1;
                    lblTexto.setText(String.valueOf(resultado));
                }
            }
        });
        btnRaiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {
                    num1 = Double.parseDouble(lblTexto.getText());
                    resultado = Math.sqrt(num1);
                    lblTexto.setText(String.valueOf(resultado));
                }
            }
        });
        btnApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lblTexto.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Você não digitou nenhum número");
                }else {

                    String teste = lblTexto.getText();
                    StringBuilder sb = new StringBuilder(teste);
                    teste = String.valueOf(sb.deleteCharAt(teste.length() - 1));
                    lblTexto.setText(teste);
                }
            }
        });
    }

    public void digita(String caractere){
        if(lblTexto.getText().equals("0.00")){
            lblTexto.setText(caractere);
        }else{
            if(caractere.equals(".") && lblTexto.getText().contains(".")){

            }else{
                lblTexto.setText(lblTexto.getText().concat(caractere));
            }
        }

    }



}


