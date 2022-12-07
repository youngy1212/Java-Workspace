package com.kh.chap01_componet.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame{
	
	public MainFrame() {
		this.setBounds(200,200,600,300);
		
		JPanel panel = new JPanel();
		
		//JTextField : 기본적인 텍스트를 입력할 수 있는 박스
		JTextField id = new JTextField(20); // 텍스트 필드의 크기
		panel.add(new JLabel("ID: "));
		panel.add(id);
		
		//JPasswordField : 비밀번호를 입력할 수 있는 상자 
		JPasswordField pwd = new JPasswordField(20);
		panel.add(new JLabel("PWD: "));
		panel.add(pwd);
		
		//JTextArea : 여러줄의 텍스트를 입력할 수 있는 상자
		JTextArea info = new JTextArea(10,30); // 텍스트 상자의 크기(세로,가로)
		panel.add(new JLabel("자기소개 : "));
		panel.add(info);
		
		//JButton : 클릭 가능한 버튼
		JButton button = new JButton("전송"); //버튼 안쪽에 보여줄 문구
		
		this.add(panel, "North");
		this.add(button);
		

		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
