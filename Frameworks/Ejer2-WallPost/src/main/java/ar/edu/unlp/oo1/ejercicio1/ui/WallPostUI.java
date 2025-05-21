package ar.edu.unlp.oo1.ejercicio1.ui;

import ar.edu.unlp.oo1.ejercicio1.impl.WallPost;
import ar.edu.unlp.oo1.ejercicio1.impl.WallPostImpl;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.logging.Logger;

public class WallPostUI {

    private static final Logger logger = Logger.getLogger("wallpost.ui");

    private final WallPost wallPost;
    private final JTextArea textArea;
    private final JLabel featuredLabelTitle;
    private final JCheckBox featuredCheckbox;
    private final JLabel likesLabelTitle;
    private final JLabel likesLabel;
    private final JButton like;
    private final JButton dislike;
    private final JFrame window;

    public WallPostUI() {
        this.wallPost = new WallPostImpl();
        this.textArea = new JTextArea();
        this.featuredLabelTitle = new JLabel("Featured");
        this.featuredCheckbox = new JCheckBox();
        this.likesLabelTitle = new JLabel("Likes");
        this.like = new JButton("Like");
        this.likesLabel = new JLabel();
        this.dislike = new JButton("Dislike");
        this.window = new JFrame("WallPost");
        this.setUpWindow();
        this.wireComponents();
        this.window.setVisible(true);
    }

    private void setUpWindow() {
        JPanel pane = new JPanel();
        this.window.getContentPane().add(pane);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(640, 480);
        pane.setLayout(new GridLayout(5, 1, 1, 10));
        pane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JScrollPane scrollPane = new JScrollPane(this.textArea);
        pane.add(scrollPane);
        this.textArea.setEditable(true);
        this.textArea.setLineWrap(true);
        this.textArea.setWrapStyleWord(true);

        JPanel featuredPane = new JPanel();
        featuredPane.setLayout(new GridLayout(1, 2));
        featuredPane.add(this.featuredLabelTitle);
        featuredPane.add(this.featuredCheckbox);
        pane.add(featuredPane);

        JPanel likesPane = new JPanel();
        likesPane.setLayout(new GridLayout(1, 2));
        likesPane.add(this.likesLabelTitle);
        likesPane.add(this.likesLabel);
        likesLabel.setText("0");
        pane.add(likesPane);

        JPanel likeButtonsPane = new JPanel();
        likeButtonsPane.setLayout(new GridLayout(1, 2));
        likeButtonsPane.add(this.like);
        likeButtonsPane.add(this.dislike);
        pane.add(likeButtonsPane);

        this.window.pack();
    }

    private void wireComponents() {
        this.like.addActionListener(e -> {
            this.wallPost.like();
            this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
            logger.info("like");
        });

        this.dislike.addActionListener(e -> {
            this.wallPost.dislike();
            this.likesLabel.setText(String.valueOf(this.wallPost.getLikes()));
            logger.info("dislike");
        });

        this.featuredCheckbox.addActionListener(e -> {
            this.wallPost.toggleFeatured();
            logger.info("featured");
        });

        this.textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
                wallPost.setText(textArea.getText());
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                wallPost.setText(textArea.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                wallPost.setText(textArea.getText());
            }
        });
    }
}
