/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first_page;

/**
 *
 * @author user
 */
public class gameBoard extends javax.swing.JFrame {

    /**
     * Creates new form gameBoard
     */
    public gameBoard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tm1 = new javax.swing.JLabel();
        demon3 = new javax.swing.JLabel();
        Rmin1 = new javax.swing.JLabel();
        Ymin1 = new javax.swing.JLabel();
        Gbuild1 = new javax.swing.JLabel();
        Rbuild1 = new javax.swing.JLabel();
        Bbuild1 = new javax.swing.JLabel();
        Ybuild1 = new javax.swing.JLabel();
        Gmin1 = new javax.swing.JLabel();
        Bmin1 = new javax.swing.JLabel();
        troll1 = new javax.swing.JLabel();
        demon4 = new javax.swing.JLabel();
        troll3 = new javax.swing.JLabel();
        troll2 = new javax.swing.JLabel();
        demon2 = new javax.swing.JLabel();
        demon1 = new javax.swing.JLabel();
        tm2 = new javax.swing.JLabel();
        tm3 = new javax.swing.JLabel();
        tm4 = new javax.swing.JLabel();
        tm5 = new javax.swing.JLabel();
        tm6 = new javax.swing.JLabel();
        tm7 = new javax.swing.JLabel();
        tm8 = new javax.swing.JLabel();
        tm9 = new javax.swing.JLabel();
        tm10 = new javax.swing.JLabel();
        tm11 = new javax.swing.JLabel();
        tm12 = new javax.swing.JLabel();
        Rmin2 = new javax.swing.JLabel();
        Rmin3 = new javax.swing.JLabel();
        Rmin4 = new javax.swing.JLabel();
        Rmin5 = new javax.swing.JLabel();
        Rmin6 = new javax.swing.JLabel();
        Rmin7 = new javax.swing.JLabel();
        Rmin8 = new javax.swing.JLabel();
        Rmin9 = new javax.swing.JLabel();
        Rmin10 = new javax.swing.JLabel();
        Rmin11 = new javax.swing.JLabel();
        Rmin12 = new javax.swing.JLabel();
        Rbuild2 = new javax.swing.JLabel();
        Rbuild3 = new javax.swing.JLabel();
        Rbuild4 = new javax.swing.JLabel();
        Rbuild5 = new javax.swing.JLabel();
        Rbuild6 = new javax.swing.JLabel();
        Ymin2 = new javax.swing.JLabel();
        Ymin3 = new javax.swing.JLabel();
        Ymin4 = new javax.swing.JLabel();
        Ymin5 = new javax.swing.JLabel();
        Ymin6 = new javax.swing.JLabel();
        Ymin7 = new javax.swing.JLabel();
        Ymin8 = new javax.swing.JLabel();
        Ymin9 = new javax.swing.JLabel();
        Ymin10 = new javax.swing.JLabel();
        Ymin11 = new javax.swing.JLabel();
        Ymin12 = new javax.swing.JLabel();
        Ybuild2 = new javax.swing.JLabel();
        Ybuild3 = new javax.swing.JLabel();
        Ybuild4 = new javax.swing.JLabel();
        Ybuild5 = new javax.swing.JLabel();
        Ybuild6 = new javax.swing.JLabel();
        Gmin2 = new javax.swing.JLabel();
        Gmin3 = new javax.swing.JLabel();
        Gmin4 = new javax.swing.JLabel();
        Gmin5 = new javax.swing.JLabel();
        Gmin6 = new javax.swing.JLabel();
        Gmin7 = new javax.swing.JLabel();
        Gmin8 = new javax.swing.JLabel();
        Gmin9 = new javax.swing.JLabel();
        Gmin10 = new javax.swing.JLabel();
        Gmin11 = new javax.swing.JLabel();
        Gmin12 = new javax.swing.JLabel();
        Gbuild2 = new javax.swing.JLabel();
        Gbuild3 = new javax.swing.JLabel();
        Gbuild4 = new javax.swing.JLabel();
        Gbuild5 = new javax.swing.JLabel();
        Gbuild6 = new javax.swing.JLabel();
        Bmin2 = new javax.swing.JLabel();
        Bmin3 = new javax.swing.JLabel();
        Bmin4 = new javax.swing.JLabel();
        Bmin5 = new javax.swing.JLabel();
        Bmin6 = new javax.swing.JLabel();
        Bmin7 = new javax.swing.JLabel();
        Bmin8 = new javax.swing.JLabel();
        Bmin9 = new javax.swing.JLabel();
        Bmin10 = new javax.swing.JLabel();
        Bmin11 = new javax.swing.JLabel();
        Bmin12 = new javax.swing.JLabel();
        Bbuild2 = new javax.swing.JLabel();
        Bbuild3 = new javax.swing.JLabel();
        Bbuild4 = new javax.swing.JLabel();
        Bbuild5 = new javax.swing.JLabel();
        Bbuild6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Board = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1103, 800));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                place(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrange(evt);
            }
        });
        getContentPane().setLayout(null);

        tm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm1.setOpaque(true);
        getContentPane().add(tm1);
        tm1.setBounds(20, 20, 13, 13);

        demon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/demon.png"))); // NOI18N
        getContentPane().add(demon3);
        demon3.setBounds(270, 10, 10, 17);

        Rmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin1);
        Rmin1.setBounds(30, 40, 11, 10);

        Ymin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin1);
        Ymin1.setBounds(780, 40, 10, 11);

        Gbuild1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildG.png"))); // NOI18N
        getContentPane().add(Gbuild1);
        Gbuild1.setBounds(370, 60, 7, 18);

        Rbuild1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildR.png"))); // NOI18N
        getContentPane().add(Rbuild1);
        Rbuild1.setBounds(20, 60, 7, 18);

        Bbuild1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildB.png"))); // NOI18N
        Bbuild1.setAutoscrolls(true);
        Bbuild1.setName(""); // NOI18N
        getContentPane().add(Bbuild1);
        Bbuild1.setBounds(520, 60, 7, 18);

        Ybuild1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildY.png"))); // NOI18N
        getContentPane().add(Ybuild1);
        Ybuild1.setBounds(770, 60, 7, 18);

        Gmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin1);
        Gmin1.setBounds(280, 40, 11, 11);

        Bmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin1);
        Bmin1.setBounds(530, 40, 11, 11);

        troll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/troll.png"))); // NOI18N
        getContentPane().add(troll1);
        troll1.setBounds(350, 20, 18, 12);

        demon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/demon.png"))); // NOI18N
        getContentPane().add(demon4);
        demon4.setBounds(290, 10, 10, 17);

        troll3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/troll.png"))); // NOI18N
        getContentPane().add(troll3);
        troll3.setBounds(390, 20, 18, 12);

        troll2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/troll.png"))); // NOI18N
        getContentPane().add(troll2);
        troll2.setBounds(370, 20, 18, 12);

        demon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/demon.png"))); // NOI18N
        getContentPane().add(demon2);
        demon2.setBounds(310, 10, 10, 17);

        demon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/demon.png"))); // NOI18N
        getContentPane().add(demon1);
        demon1.setBounds(330, 10, 10, 17);

        tm2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm2.setOpaque(true);
        getContentPane().add(tm2);
        tm2.setBounds(40, 20, 13, 13);

        tm3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm3.setOpaque(true);
        getContentPane().add(tm3);
        tm3.setBounds(60, 20, 13, 13);

        tm4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm4.setOpaque(true);
        getContentPane().add(tm4);
        tm4.setBounds(80, 20, 13, 13);

        tm5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm5.setOpaque(true);
        getContentPane().add(tm5);
        tm5.setBounds(100, 20, 13, 13);

        tm6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm6.setOpaque(true);
        getContentPane().add(tm6);
        tm6.setBounds(120, 20, 13, 13);

        tm7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm7.setOpaque(true);
        getContentPane().add(tm7);
        tm7.setBounds(140, 20, 13, 13);

        tm8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm8.setOpaque(true);
        getContentPane().add(tm8);
        tm8.setBounds(160, 20, 13, 13);

        tm9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm9.setOpaque(true);
        getContentPane().add(tm9);
        tm9.setBounds(180, 20, 13, 13);

        tm10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm10.setOpaque(true);
        getContentPane().add(tm10);
        tm10.setBounds(200, 20, 13, 13);

        tm11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm11.setOpaque(true);
        getContentPane().add(tm11);
        tm11.setBounds(220, 20, 13, 13);

        tm12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/TM.png"))); // NOI18N
        tm12.setOpaque(true);
        getContentPane().add(tm12);
        tm12.setBounds(240, 20, 13, 13);

        Rmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin2);
        Rmin2.setBounds(50, 40, 11, 11);

        Rmin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin3);
        Rmin3.setBounds(70, 40, 11, 11);

        Rmin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin4);
        Rmin4.setBounds(90, 40, 11, 11);

        Rmin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin5);
        Rmin5.setBounds(130, 40, 11, 11);

        Rmin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin6);
        Rmin6.setBounds(110, 40, 11, 11);

        Rmin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin7);
        Rmin7.setBounds(150, 40, 11, 10);

        Rmin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin8);
        Rmin8.setBounds(170, 40, 11, 11);

        Rmin9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin9);
        Rmin9.setBounds(190, 40, 11, 11);

        Rmin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin10);
        Rmin10.setBounds(210, 40, 11, 10);

        Rmin11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin11);
        Rmin11.setBounds(230, 40, 11, 10);

        Rmin12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minR.png"))); // NOI18N
        getContentPane().add(Rmin12);
        Rmin12.setBounds(250, 40, 11, 10);

        Rbuild2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildR.png"))); // NOI18N
        getContentPane().add(Rbuild2);
        Rbuild2.setBounds(40, 60, 7, 18);

        Rbuild3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildR.png"))); // NOI18N
        getContentPane().add(Rbuild3);
        Rbuild3.setBounds(60, 60, 7, 18);

        Rbuild4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildR.png"))); // NOI18N
        getContentPane().add(Rbuild4);
        Rbuild4.setBounds(80, 60, 7, 18);

        Rbuild5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildR.png"))); // NOI18N
        getContentPane().add(Rbuild5);
        Rbuild5.setBounds(100, 60, 7, 18);

        Rbuild6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildR.png"))); // NOI18N
        getContentPane().add(Rbuild6);
        Rbuild6.setBounds(120, 60, 7, 18);

        Ymin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin2);
        Ymin2.setBounds(800, 40, 10, 11);

        Ymin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin3);
        Ymin3.setBounds(820, 40, 10, 11);

        Ymin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin4);
        Ymin4.setBounds(840, 40, 10, 11);

        Ymin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin5);
        Ymin5.setBounds(860, 40, 10, 11);

        Ymin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin6);
        Ymin6.setBounds(880, 40, 10, 11);

        Ymin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin7);
        Ymin7.setBounds(900, 40, 10, 11);

        Ymin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin8);
        Ymin8.setBounds(920, 40, 10, 11);

        Ymin9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin9);
        Ymin9.setBounds(940, 40, 10, 11);

        Ymin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin10);
        Ymin10.setBounds(960, 40, 10, 11);

        Ymin11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin11);
        Ymin11.setBounds(980, 40, 10, 11);

        Ymin12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minY.png"))); // NOI18N
        getContentPane().add(Ymin12);
        Ymin12.setBounds(1000, 40, 10, 11);

        Ybuild2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildY.png"))); // NOI18N
        getContentPane().add(Ybuild2);
        Ybuild2.setBounds(790, 60, 7, 18);

        Ybuild3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildY.png"))); // NOI18N
        getContentPane().add(Ybuild3);
        Ybuild3.setBounds(810, 60, 7, 18);

        Ybuild4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildY.png"))); // NOI18N
        getContentPane().add(Ybuild4);
        Ybuild4.setBounds(830, 60, 7, 18);

        Ybuild5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildY.png"))); // NOI18N
        getContentPane().add(Ybuild5);
        Ybuild5.setBounds(850, 60, 7, 18);

        Ybuild6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildY.png"))); // NOI18N
        getContentPane().add(Ybuild6);
        Ybuild6.setBounds(870, 60, 7, 18);

        Gmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin2);
        Gmin2.setBounds(300, 40, 11, 11);

        Gmin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin3);
        Gmin3.setBounds(320, 40, 11, 11);

        Gmin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin4);
        Gmin4.setBounds(340, 40, 11, 11);

        Gmin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin5);
        Gmin5.setBounds(360, 40, 11, 11);

        Gmin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin6);
        Gmin6.setBounds(380, 40, 11, 11);

        Gmin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin7);
        Gmin7.setBounds(400, 40, 11, 11);

        Gmin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin8);
        Gmin8.setBounds(420, 40, 11, 11);

        Gmin9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin9);
        Gmin9.setBounds(440, 40, 11, 11);

        Gmin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin10);
        Gmin10.setBounds(460, 40, 11, 11);

        Gmin11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin11);
        Gmin11.setBounds(480, 40, 11, 11);

        Gmin12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minG.png"))); // NOI18N
        getContentPane().add(Gmin12);
        Gmin12.setBounds(500, 40, 11, 11);

        Gbuild2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildG.png"))); // NOI18N
        getContentPane().add(Gbuild2);
        Gbuild2.setBounds(290, 60, 7, 20);

        Gbuild3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildG.png"))); // NOI18N
        getContentPane().add(Gbuild3);
        Gbuild3.setBounds(310, 60, 7, 18);

        Gbuild4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildG.png"))); // NOI18N
        getContentPane().add(Gbuild4);
        Gbuild4.setBounds(330, 60, 7, 18);

        Gbuild5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildG.png"))); // NOI18N
        getContentPane().add(Gbuild5);
        Gbuild5.setBounds(350, 60, 7, 18);

        Gbuild6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildG.png"))); // NOI18N
        getContentPane().add(Gbuild6);
        Gbuild6.setBounds(270, 60, 7, 18);

        Bmin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin2);
        Bmin2.setBounds(550, 40, 11, 11);

        Bmin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin3);
        Bmin3.setBounds(570, 40, 11, 11);

        Bmin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin4);
        Bmin4.setBounds(590, 40, 11, 11);

        Bmin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin5);
        Bmin5.setBounds(610, 40, 11, 11);

        Bmin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin6);
        Bmin6.setBounds(630, 40, 11, 11);

        Bmin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin7);
        Bmin7.setBounds(650, 40, 10, 11);

        Bmin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin8);
        Bmin8.setBounds(670, 40, 11, 11);

        Bmin9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin9);
        Bmin9.setBounds(690, 40, 11, 11);

        Bmin10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin10);
        Bmin10.setBounds(710, 40, 11, 10);

        Bmin11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin11);
        Bmin11.setBounds(730, 40, 11, 11);

        Bmin12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/minB.png"))); // NOI18N
        getContentPane().add(Bmin12);
        Bmin12.setBounds(750, 40, 11, 11);

        Bbuild2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildB.png"))); // NOI18N
        Bbuild2.setAutoscrolls(true);
        Bbuild2.setName(""); // NOI18N
        getContentPane().add(Bbuild2);
        Bbuild2.setBounds(540, 60, 7, 18);

        Bbuild3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildB.png"))); // NOI18N
        Bbuild3.setAutoscrolls(true);
        Bbuild3.setName(""); // NOI18N
        getContentPane().add(Bbuild3);
        Bbuild3.setBounds(560, 60, 7, 18);

        Bbuild4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildB.png"))); // NOI18N
        Bbuild4.setAutoscrolls(true);
        Bbuild4.setName(""); // NOI18N
        getContentPane().add(Bbuild4);
        Bbuild4.setBounds(580, 60, 7, 18);

        Bbuild5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildB.png"))); // NOI18N
        Bbuild5.setAutoscrolls(true);
        Bbuild5.setName(""); // NOI18N
        getContentPane().add(Bbuild5);
        Bbuild5.setBounds(600, 60, 7, 18);

        Bbuild6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/buildB.png"))); // NOI18N
        Bbuild6.setAutoscrolls(true);
        Bbuild6.setName(""); // NOI18N
        getContentPane().add(Bbuild6);
        Bbuild6.setBounds(620, 60, 7, 18);

        jButton1.setText("Put TMs Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(850, 160, 130, 23);

        Board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/board.png"))); // NOI18N
        getContentPane().add(Board);
        Board.setBounds(40, 90, 790, 600);

        jButton2.setText("Put Minions Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 200, 130, 23);

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(850, 240, 130, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   tm1.setBounds(20, 20, 13, 13);
        tm2.setBounds(40, 20, 13, 13);
   tm3.setBounds(60, 20, 13, 13);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void place(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_place
    
    }//GEN-LAST:event_place

    private void arrange(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrange
           tm1.setBounds(428, 668, 13, 13);       
        Rmin1.setBounds(440, 678, 11, 10);
        Gmin1.setBounds(455, 678, 11, 10);
        Bmin1.setBounds(470, 678, 11, 10);
        Ymin1.setBounds(485, 678, 11, 10);
        tm2.setBounds(460, 483, 13, 13); 
        Rmin2.setBounds(470, 493, 11, 10);
        Gmin2.setBounds(485, 493, 11, 10);
        Bmin2.setBounds(500, 493, 11, 10);
        Ymin2.setBounds(515, 493, 11, 10);
        tm3.setBounds(510, 103, 13, 13); 
        Rmin3.setBounds(520, 113, 11, 10);
        Gmin3.setBounds(535, 113, 11, 10);
        Bmin3.setBounds(550, 113, 11, 10);
        Ymin3.setBounds(565, 113, 11, 10);
    }//GEN-LAST:event_arrange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
        Rmin1.setBounds(30, 40, 11, 10);
        Gmin1.setBounds(280, 40, 11, 10);
        Bmin1.setBounds(530, 40, 11, 10);
        Ymin1.setBounds(780, 40, 11, 10);
     
        Rmin2.setBounds(50, 40, 11, 10);
        Gmin2.setBounds(300, 40, 11, 10);
        Bmin2.setBounds(550, 40, 11, 10);
        Ymin2.setBounds(800, 40, 11, 10);
      
        Rmin3.setBounds(70, 40, 11, 10);
        Gmin3.setBounds(320, 40, 11, 10);
        Bmin3.setBounds(570, 40, 11, 10);
        Ymin3.setBounds(820, 40, 11, 10);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bbuild1;
    private javax.swing.JLabel Bbuild2;
    private javax.swing.JLabel Bbuild3;
    private javax.swing.JLabel Bbuild4;
    private javax.swing.JLabel Bbuild5;
    private javax.swing.JLabel Bbuild6;
    private javax.swing.JLabel Bmin1;
    private javax.swing.JLabel Bmin10;
    private javax.swing.JLabel Bmin11;
    private javax.swing.JLabel Bmin12;
    private javax.swing.JLabel Bmin2;
    private javax.swing.JLabel Bmin3;
    private javax.swing.JLabel Bmin4;
    private javax.swing.JLabel Bmin5;
    private javax.swing.JLabel Bmin6;
    private javax.swing.JLabel Bmin7;
    private javax.swing.JLabel Bmin8;
    private javax.swing.JLabel Bmin9;
    private javax.swing.JLabel Board;
    private javax.swing.JLabel Gbuild1;
    private javax.swing.JLabel Gbuild2;
    private javax.swing.JLabel Gbuild3;
    private javax.swing.JLabel Gbuild4;
    private javax.swing.JLabel Gbuild5;
    private javax.swing.JLabel Gbuild6;
    private javax.swing.JLabel Gmin1;
    private javax.swing.JLabel Gmin10;
    private javax.swing.JLabel Gmin11;
    private javax.swing.JLabel Gmin12;
    private javax.swing.JLabel Gmin2;
    private javax.swing.JLabel Gmin3;
    private javax.swing.JLabel Gmin4;
    private javax.swing.JLabel Gmin5;
    private javax.swing.JLabel Gmin6;
    private javax.swing.JLabel Gmin7;
    private javax.swing.JLabel Gmin8;
    private javax.swing.JLabel Gmin9;
    private javax.swing.JLabel Rbuild1;
    private javax.swing.JLabel Rbuild2;
    private javax.swing.JLabel Rbuild3;
    private javax.swing.JLabel Rbuild4;
    private javax.swing.JLabel Rbuild5;
    private javax.swing.JLabel Rbuild6;
    private javax.swing.JLabel Rmin1;
    private javax.swing.JLabel Rmin10;
    private javax.swing.JLabel Rmin11;
    private javax.swing.JLabel Rmin12;
    private javax.swing.JLabel Rmin2;
    private javax.swing.JLabel Rmin3;
    private javax.swing.JLabel Rmin4;
    private javax.swing.JLabel Rmin5;
    private javax.swing.JLabel Rmin6;
    private javax.swing.JLabel Rmin7;
    private javax.swing.JLabel Rmin8;
    private javax.swing.JLabel Rmin9;
    private javax.swing.JLabel Ybuild1;
    private javax.swing.JLabel Ybuild2;
    private javax.swing.JLabel Ybuild3;
    private javax.swing.JLabel Ybuild4;
    private javax.swing.JLabel Ybuild5;
    private javax.swing.JLabel Ybuild6;
    private javax.swing.JLabel Ymin1;
    private javax.swing.JLabel Ymin10;
    private javax.swing.JLabel Ymin11;
    private javax.swing.JLabel Ymin12;
    private javax.swing.JLabel Ymin2;
    private javax.swing.JLabel Ymin3;
    private javax.swing.JLabel Ymin4;
    private javax.swing.JLabel Ymin5;
    private javax.swing.JLabel Ymin6;
    private javax.swing.JLabel Ymin7;
    private javax.swing.JLabel Ymin8;
    private javax.swing.JLabel Ymin9;
    private javax.swing.JLabel demon1;
    private javax.swing.JLabel demon2;
    private javax.swing.JLabel demon3;
    private javax.swing.JLabel demon4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel tm1;
    private javax.swing.JLabel tm10;
    private javax.swing.JLabel tm11;
    private javax.swing.JLabel tm12;
    private javax.swing.JLabel tm2;
    private javax.swing.JLabel tm3;
    private javax.swing.JLabel tm4;
    private javax.swing.JLabel tm5;
    private javax.swing.JLabel tm6;
    private javax.swing.JLabel tm7;
    private javax.swing.JLabel tm8;
    private javax.swing.JLabel tm9;
    private javax.swing.JLabel troll1;
    private javax.swing.JLabel troll2;
    private javax.swing.JLabel troll3;
    // End of variables declaration//GEN-END:variables
}
