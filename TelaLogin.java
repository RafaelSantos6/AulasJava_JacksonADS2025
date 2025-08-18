import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {

    // Componentes da interface gráfica
    private JLabel rotuloUsuario;
    private JLabel rotuloSenha;
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogin;
    private JLabel mensagem;

    public TelaLogin() {
        // Configurações da janela principal
        setTitle("Sistema de Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1)); // Layout simples em grade
        setLocationRelativeTo(null); // Centraliza a janela

        // Inicialização dos componentes
        rotuloUsuario = new JLabel("Usuário:");
        rotuloSenha = new JLabel("Senha:");
        campoUsuario = new JTextField();
        campoSenha = new JPasswordField();
        botaoLogin = new JButton("Entrar");
        mensagem = new JLabel(""); // Mensagem de feedback inicial vazia

        // Adiciona os componentes à janela
        add(rotuloUsuario);
        add(campoUsuario);
        add(rotuloSenha);
        add(campoSenha);
        add(botaoLogin);
        add(mensagem);

        // Adiciona o "ouvinte" de ação para o botão de login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarLogin();
            }
        });
    }

    private void verificarLogin() {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        // Lógica de autenticação simples (substitua por sua lógica real)
        if (usuario.equals("admin") && senha.equals("1234")) {
            mensagem.setForeground(Color.GREEN);
            mensagem.setText("Login bem-sucedido!");
            // Aqui você pode abrir a próxima tela do seu sistema
            // Exemplo: new TelaPrincipal().setVisible(true);
            // dispose(); // Fecha a tela de login
        } else {
            mensagem.setForeground(Color.RED);
            mensagem.setText("Usuário ou senha inválidos.");
        }
    }

    public static void main(String[] args) {
        // Garante que a interface gráfica seja criada na thread de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
}