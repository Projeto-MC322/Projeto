package com.unicamp.mc322.projeto.Interface;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.unicamp.mc322.projeto.cartas.Carta;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;


public class InterfaceGrafica extends javax.swing.JFrame {
	private ArrayList<JButton> maoP1 = new ArrayList<JButton>();
	private ArrayList<JButton> maoP2 = new ArrayList<JButton>();
	private ArrayList<JButton> evocadasP1 = new ArrayList<JButton>();
	private ArrayList<JButton> evocadasP2 = new ArrayList<JButton>();
	private ArrayList<JButton> emCampoP1 = new ArrayList<JButton>();
	private ArrayList<JButton> emCampoP2 = new ArrayList<JButton>();

    public InterfaceGrafica() {
    	getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
        initComponents();
    }
    
	public void iniciar(int nexusP1, int nexusP2, ArrayList<Carta> maoPlayer1, ArrayList<Carta> maoPlayer2) {
		setVidaNexusP1(nexusP1);
		setVidaNexusP2(nexusP2);
		
		for(int i = 0; i < maoP1.size(); i++) {
			maoP1.get(i).setVisible(false);
			maoP2.get(i).setVisible(false);
			evocadasP1.get(i).setVisible(false);
			evocadasP2.get(i).setVisible(false);
			emCampoP1.get(i).setVisible(false);
			emCampoP2.get(i).setVisible(false);
		}
		
		atualizarMaoP1(maoPlayer1);
		atualizarMaoP2(maoPlayer2);
	}
	
	public void setVidaNexusP1(int valor) {
		jblP1VidaNexus.setText(Integer.toString(valor));
	}
	public void setVidaNexusP2(int valor) {
		jblP2VidaNexus.setText(Integer.toString(valor));
	}
	
	public void atualizarMaoP1(ArrayList<Carta> mao) {
		for(int i = 0; i < mao.size() && i < maoP1.size(); i++) {
			maoP1.get(i).setText(mao.get(i).toStringCompra());
			maoP1.get(i).setVisible(true);
		}
	}
	public void atualizarMaoP2(ArrayList<Carta> mao) {
		for(int i = 0; i < mao.size() && i < maoP2.size(); i++) {
			maoP2.get(i).setText(mao.get(i).toStringCompra());
			maoP2.get(i).setVisible(true);
		}
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jblP1VidaNexus = new javax.swing.JLabel();
        jblP2VidaNexus = new javax.swing.JLabel();
        jblTipoDeTurnoPlayer1 = new javax.swing.JLabel();
        jblTipoDeTurnoPlayer2 = new javax.swing.JLabel();
        bntAvancarTurno = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jblP1Mana = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jblP1ManaFeitico = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jblP2Mana = new javax.swing.JLabel();
        jblP2ManaFeitico = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        bntP1Mao_0 = new javax.swing.JButton();
        bntP1Mao_0.setFont(new Font("Tahoma", Font.PLAIN, 9));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(910, 770));
        setResizable(false);

        jblP1VidaNexus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jblP1VidaNexus.setText("20");

        jblP2VidaNexus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jblP2VidaNexus.setText("20");

        jblTipoDeTurnoPlayer1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jblTipoDeTurnoPlayer1.setText("Defesa");

        jblTipoDeTurnoPlayer2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jblTipoDeTurnoPlayer2.setText("Ataque");

        bntAvancarTurno.setText("Turno do Oponente");
        bntAvancarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Mana de Feiti�o");

        jblP1Mana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblP1Mana.setForeground(new java.awt.Color(153, 153, 255));
        jblP1Mana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblP1Mana.setText("5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Mana");

        jblP1ManaFeitico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblP1ManaFeitico.setForeground(new java.awt.Color(255, 153, 153));
        jblP1ManaFeitico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblP1ManaFeitico.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Mana");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("Mana de Feiti�o");

        jblP2Mana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblP2Mana.setForeground(new java.awt.Color(153, 153, 255));
        jblP2Mana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblP2Mana.setText("5");

        jblP2ManaFeitico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblP2ManaFeitico.setForeground(new java.awt.Color(255, 153, 153));
        jblP2ManaFeitico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblP2ManaFeitico.setText("0");

        jLayeredPane2.setBackground(new java.awt.Color(153, 255, 153));
        jLayeredPane2.setOpaque(true);
        bntP1EmCampo_0 = new javax.swing.JButton();
        
                bntP1EmCampo_0.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5</html>");
                jLayeredPane2.setLayer(bntP1EmCampo_0, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        bntP1EmCampo_1 = new JButton();
        bntP1EmCampo_1.setText("<html>Campeao 1<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP1EmCampo_2 = new JButton();
        bntP1EmCampo_2.setText("<html>Campeao 2<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP1EmCampo_3 = new JButton();
        bntP1EmCampo_3.setText("<html>Campeao 3<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP1EmCampo_4 = new JButton();
        bntP1EmCampo_4.setText("<html>Campeao 4<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP1EmCampo_5 = new JButton();
        bntP1EmCampo_5.setText("<html>Campeao 5<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP2EmCampo_0 = new JButton();
        bntP2EmCampo_0.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP2EmCampo_1 = new JButton();
        bntP2EmCampo_1.setText("<html>Campeao 1<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP2EmCampo_2 = new JButton();
        bntP2EmCampo_2.setText("<html>Campeao 2<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP2EmCampo_3 = new JButton();
        bntP2EmCampo_3.setText("<html>Campeao 3<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP2EmCampo_4 = new JButton();
        bntP2EmCampo_4.setText("<html>Campeao 4<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntP2EmCampo_5 = new JButton();
        bntP2EmCampo_5.setText("<html>Campeao 5<br /><br />Vida: 10<br />Ataque: 5</html>");
        
        bntFeitico = new JButton();
        bntFeitico.setText("<html>Feitico</html>");

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2Layout.setHorizontalGroup(
        	jLayeredPane2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jLayeredPane2Layout.createSequentialGroup()
        			.addGroup(jLayeredPane2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jLayeredPane2Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jLayeredPane2Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jLayeredPane2Layout.createSequentialGroup()
        							.addComponent(bntP2EmCampo_0, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        							.addGap(6)
        							.addComponent(bntP2EmCampo_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        							.addGap(6)
        							.addComponent(bntP2EmCampo_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        							.addGap(6)
        							.addComponent(bntP2EmCampo_3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        							.addGap(6)
        							.addComponent(bntP2EmCampo_4, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        							.addGap(6)
        							.addComponent(bntP2EmCampo_5, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
        						.addGroup(jLayeredPane2Layout.createSequentialGroup()
        							.addGroup(jLayeredPane2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jLayeredPane2Layout.createSequentialGroup()
        									.addGap(110)
        									.addComponent(bntP1EmCampo_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(bntP1EmCampo_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(bntP1EmCampo_3, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
        								.addComponent(bntP1EmCampo_0, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bntP1EmCampo_4, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bntP1EmCampo_5, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(jLayeredPane2Layout.createSequentialGroup()
        					.addGap(282)
        					.addComponent(bntFeitico, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
        	jLayeredPane2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jLayeredPane2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jLayeredPane2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(bntP2EmCampo_0, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP2EmCampo_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP2EmCampo_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP2EmCampo_3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP2EmCampo_4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP2EmCampo_5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addComponent(bntFeitico, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
        			.addGroup(jLayeredPane2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(bntP1EmCampo_0)
        				.addComponent(bntP1EmCampo_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1EmCampo_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1EmCampo_3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1EmCampo_4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1EmCampo_5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jLayeredPane2.setLayout(jLayeredPane2Layout);

        bntP1Mao_0.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        
        bntP1Mao_1 = new JButton();
        bntP1Mao_1.setText("<html>Campeao 1<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP1Mao_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP1Mao_2 = new JButton();
        bntP1Mao_2.setText("<html>Campeao 2<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP1Mao_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP1Mao_3 = new JButton();
        bntP1Mao_3.setText("<html>Campeao 3<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP1Mao_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP1Mao_4 = new JButton();
        bntP1Mao_4.setText("<html>Campeao 4<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP1Mao_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP1Mao_5 = new JButton();
        bntP1Mao_5.setText("<html>Campeao 5<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP1Mao_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP1Evocada_0 = new JButton();
        bntP1Evocada_0.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP1Evocada_0.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP1Evocada_1 = new JButton();
        bntP1Evocada_1.setText("<html>Campeao 1<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP1Evocada_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP1Evocada_2 = new JButton();
        bntP1Evocada_2.setText("<html>Campeao 2<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP1Evocada_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP1Evocada_3 = new JButton();
        bntP1Evocada_3.setText("<html>Campeao 3<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP1Evocada_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP1Evocada_4 = new JButton();
        bntP1Evocada_4.setText("<html>Campeao 4<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP1Evocada_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP1Evocada_5 = new JButton();
        bntP1Evocada_5.setText("<html>Campeao 5<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP1Evocada_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JLabel jLabel1 = new JLabel();
        jLabel1.setText("Jogador 2");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setForeground(Color.RED);
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        jLabel0 = new JLabel();
        jLabel0.setText("Nexus");
        jLabel0.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel0.setForeground(Color.RED);
        jLabel0.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        jLabel2 = new JLabel();
        jLabel2.setText("Nexus");
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setForeground(Color.BLUE);
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        jLabel3 = new JLabel();
        jLabel3.setText("Jogador 1");
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setForeground(Color.BLUE);
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        JButton bntP2Evocada_0 = new JButton();
        bntP2Evocada_0.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP2Evocada_0.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP2Evocada_1 = new JButton();
        bntP2Evocada_1.setText("<html>Campeao 1<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP2Evocada_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP2Evocada_2 = new JButton();
        bntP2Evocada_2.setText("<html>Campeao 2<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP2Evocada_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP2Evocada_3 = new JButton();
        bntP2Evocada_3.setText("<html>Campeao 3<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP2Evocada_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP2Evocada_4 = new JButton();
        bntP2Evocada_4.setText("<html>Campeao 4<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP2Evocada_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        JButton bntP2Evocada_5 = new JButton();
        bntP2Evocada_5.setText("<html>Campeao 5<br /><br />Vida: 10<br />Ataque: 5<br />Nivel: 1</html>");
        bntP2Evocada_5.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP2Mao_0 = new JButton();
        bntP2Mao_0.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP2Mao_0.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP2Mao_1 = new JButton();
        bntP2Mao_1.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP2Mao_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP2Mao_2 = new JButton();
        bntP2Mao_2.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP2Mao_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP2Mao_3 = new JButton();
        bntP2Mao_3.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP2Mao_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP2Mao_4 = new JButton();
        bntP2Mao_4.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP2Mao_4.setFont(new Font("Tahoma", Font.PLAIN, 9));
        
        bntP2Mao_5 = new JButton();
        bntP2Mao_5.setText("<html>Campeao 0<br /><br />Vida: 10<br />Ataque: 5<br />Custo: 0</html>");
        bntP2Mao_5.setFont(new Font("Tahoma", Font.PLAIN, 9));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel0, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jblP1VidaNexus)
        							.addGap(34))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jblP2VidaNexus)
        							.addGap(30)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(53)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(bntP2Mao_0, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Mao_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Mao_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Mao_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Mao_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Mao_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(bntP2Evocada_0, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Evocada_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Evocada_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Evocada_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Evocada_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        									.addGap(18)
        									.addComponent(bntP2Evocada_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(1)
        							.addComponent(jLayeredPane2, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(140)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(bntP1Mao_0, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP1Evocada_0, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(bntP1Mao_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Mao_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Mao_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Mao_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Mao_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(bntP1Evocada_1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Evocada_2, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Evocada_3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Evocada_4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(bntP1Evocada_5, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel7)
        						.addComponent(bntAvancarTurno)
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(39)
        						.addComponent(jblP1Mana, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(41)
        						.addComponent(jblP1ManaFeitico, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(8)
        						.addComponent(jLabel4))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(19)
        						.addComponent(jblTipoDeTurnoPlayer1))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(43)
        						.addComponent(jblP2Mana, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createSequentialGroup()
        						.addGap(41)
        						.addComponent(jblP2ManaFeitico, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(17)
        					.addComponent(jblTipoDeTurnoPlayer2)))
        			.addContainerGap(601, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(21)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(bntP2Mao_0, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Mao_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Mao_2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Mao_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Mao_4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Mao_5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(bntP2Evocada_0, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Evocada_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Evocada_2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Evocada_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Evocada_4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        						.addComponent(bntP2Evocada_5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addComponent(jLayeredPane2, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(296)
        					.addComponent(jblP2VidaNexus)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel0, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        					.addGap(2)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        					.addGap(2)
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jblP1VidaNexus)))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(82)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(36)
        							.addComponent(bntP1Mao_0, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(37)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(bntP1Mao_2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        								.addComponent(bntP1Mao_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        								.addComponent(bntP1Mao_4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        								.addComponent(bntP1Mao_5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        								.addComponent(bntP1Mao_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))))
        				.addComponent(bntP1Evocada_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1Evocada_0, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1Evocada_2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1Evocada_3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1Evocada_4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bntP1Evocada_5, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(174, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(203)
        			.addGroup(layout.createSequentialGroup()
        				.addComponent(jblTipoDeTurnoPlayer1)
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(jblP2ManaFeitico)
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(jLabel4)
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(jblP2Mana)
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
        				.addPreferredGap(ComponentPlacement.UNRELATED)
        				.addComponent(bntAvancarTurno, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        				.addGap(8)
        				.addComponent(jLabel6)
        				.addGap(4)
        				.addComponent(jblP1Mana)
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(jLabel7)
        				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jblP1ManaFeitico)
        				.addPreferredGap(ComponentPlacement.RELATED))
        			.addGroup(layout.createSequentialGroup()
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(jblTipoDeTurnoPlayer2))
        			.addGap(391))
        );
        getContentPane().setLayout(layout);

        pack();
    
        maoP1.add(bntP1Mao_0);
        maoP1.add(bntP1Mao_1);
        maoP1.add(bntP1Mao_2);
        maoP1.add(bntP1Mao_3);
        maoP1.add(bntP1Mao_4);
        maoP1.add(bntP1Mao_5);
        
        maoP2.add(bntP2Mao_0);
        maoP2.add(bntP2Mao_1);
        maoP2.add(bntP2Mao_2);
        maoP2.add(bntP2Mao_3);
        maoP2.add(bntP2Mao_4);
        maoP2.add(bntP2Mao_5);
        
        evocadasP1.add(bntP1Evocada_0);
        evocadasP1.add(bntP1Evocada_1);
        evocadasP1.add(bntP1Evocada_2);
        evocadasP1.add(bntP1Evocada_3);
        evocadasP1.add(bntP1Evocada_4);
        evocadasP1.add(bntP1Evocada_5);
        
        evocadasP2.add(bntP2Evocada_0);
        evocadasP2.add(bntP2Evocada_1);
        evocadasP2.add(bntP2Evocada_2);
        evocadasP2.add(bntP2Evocada_3);
        evocadasP2.add(bntP2Evocada_4);
        evocadasP2.add(bntP2Evocada_5);
        
        emCampoP1.add(bntP1EmCampo_0);
        emCampoP1.add(bntP1EmCampo_1);
        emCampoP1.add(bntP1EmCampo_2);
        emCampoP1.add(bntP1EmCampo_3);
        emCampoP1.add(bntP1EmCampo_4);
        emCampoP1.add(bntP1EmCampo_5);
        
        emCampoP2.add(bntP2EmCampo_0);
        emCampoP2.add(bntP2EmCampo_1);
        emCampoP2.add(bntP2EmCampo_2);
        emCampoP2.add(bntP2EmCampo_3);
        emCampoP2.add(bntP2EmCampo_4);
        emCampoP2.add(bntP2EmCampo_5);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton bntP1Mao_0;
    private javax.swing.JButton bntP1EmCampo_0;
    private javax.swing.JButton bntAvancarTurno;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel jblP1ManaFeitico;
    private javax.swing.JLabel jblP2ManaFeitico;
    private javax.swing.JLabel jblP1Mana;
    private javax.swing.JLabel jblP2Mana;
    private javax.swing.JLabel jblTipoDeTurnoPlayer1;
    private javax.swing.JLabel jblTipoDeTurnoPlayer2;
    private javax.swing.JLabel jblP1VidaNexus;
    private javax.swing.JLabel jblP2VidaNexus;
    private JButton bntP1Mao_1;
    private JButton bntP1Mao_2;
    private JButton bntP1Mao_3;
    private JButton bntP1Mao_4;
    private JButton bntP1Mao_5;
    private JButton bntP1EmCampo_1;
    private JButton bntP1EmCampo_2;
    private JButton bntP1EmCampo_3;
    private JButton bntP1EmCampo_4;
    private JLabel jLabel0;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JButton bntP1EmCampo_5;
    private JButton bntP2EmCampo_0;
    private JButton bntP2EmCampo_1;
    private JButton bntP2EmCampo_2;
    private JButton bntP2EmCampo_3;
    private JButton bntP2EmCampo_4;
    private JButton bntP2EmCampo_5;
    private JButton bntFeitico;
    private JButton bntP2Mao_0;
    private JButton bntP2Mao_1;
    private JButton bntP2Mao_2;
    private JButton bntP2Mao_3;
    private JButton bntP2Mao_4;
    private JButton bntP2Mao_5;
}