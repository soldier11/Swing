import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SeaBattle {

	public static void main(String[] args) {
		System.out.println("やっぱろーSwingに挑戦するよ！");// 意気込みｗｗ
		JFrame jf = new JFrame(); // jfというフレーム作成
		jf.setBounds(50, 100, 300, 300);// jfというフレームの設定表示位置と大きさ縦*横
		jf.setVisible(true);// jfの表示
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// フレームの閉じるボタンの操作＝プログラムの終了

		JPanel jp = new JPanel();// 背景のパネル作成
		jp.setBackground(Color.BLACK);// 背景の色を設定
		jf.add(jp);// フレームに追加

		
		JLabel JlImage1 = new JLabel(new javax.swing.ImageIcon(
				"C:/workspace/Swing/bin/Select.png"));// 画像ファイルの読み込み
		JlImage1.setOpaque(false);
		JlImage1.setBounds(130, 130, 30, 30);
		jp.add(JlImage1);

		
		jp.setLayout(null);// デフォルトの配置レイアウトの機能を無効化
		JLabel jlImage = null;
		for (int ii = 0; ii < 3; ii++) {// 海チップの配置
			for (int jj = 0; jj < 3; jj++) {
				jlImage = new JLabel(new javax.swing.ImageIcon(
						"C:/workspace/Swing/bin/Sea.png"));// 画像ファイルの読み込み
				jlImage.setBounds(100 + 30 * ii, 100 + 30 * jj, 30, 30);
				jp.add(jlImage);
			}
		}
		
	}


}

