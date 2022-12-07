package com.kh.chap03_event.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame{

	public MainFrame() {
		this.setBounds(200,200,300,200);
		
		this.setTitle("계산기");
		this.setResizable(false); // 사이즈를 바꿀수 없게
		
		
		JPanel inputPanel = new JPanel(); // 사용자에게 값을 입력받는 입력용 패널
		JPanel resultPanel = new JPanel(); // 사용자에게 결과값을 출력해주는 출력용 패널
		
		//입력용 패널에 부착할 내용
		JTextField num1 = new JTextField(15);
		JTextField num2 = new JTextField(15);
		
		inputPanel.add(new JLabel("첫번쨰 정수 : "));
		inputPanel.add(num1);
		inputPanel.add(new JLabel("두번쨰 정수 : "));
		inputPanel.add(num2);
		
		JPanel btnPanel = new JPanel();
		
		JButton plusBtn = new JButton("+");
		JButton minusBtn = new JButton("-");
		
		btnPanel.add(plusBtn);
		btnPanel.add(minusBtn);
		
		inputPanel.add(btnPanel);
		
		// 결과물 패널에 부착할 내용
		
		JTextField result = new JTextField(15);
		resultPanel.add(new JLabel("결과 : "));
		resultPanel.add(result);
		
		JLabel title = new JLabel("두 개의 정수를 입력하세요",0); // 0: 가운데 정렬
		
		this.add(title,"North"); //가장 위에
		this.add(inputPanel, "Center");
		this.add(resultPanel,"South");
		
		// 각 버튼에 이벤트 걸어주기(이벤트 연결)
		// plusBtn 클릭시 => 두개의 정수값을 가져온 후 덧셈연산 결과를 result 텍스트 상자에 출력
		plusBtn.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				//plusBtn 클릭시 실행할 내용
				int Value1 = Integer.parseInt(num1.getText());
				int Value2 = Integer.parseInt(num2.getText());
				result.setText(Value1+Value2+"");
			}
		});
		
		// ActionListener : 인터페이스이기 때문에 곧바로 생성 불가능.
		// 단, 여기서 생성을 하고 싶다면 " 미완성된 메소드"를 완성시키면서 생성 => 익명 클래스 방식
		
		//minusBtn 클릭시 => 두 개의 정수값을 가져온 후 뺄셈연산 결과를 result 텍스트 박스에 출력
		
		minusBtn.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				int value1 = Integer.parseInt(num1.getText());
				int value2 = Integer.parseInt(num2.getText());
				result.setText(value1 - value2 + "");
				
			}
			
		});
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
}
