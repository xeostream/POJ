import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(new BufferedInputStream(System.in));
		BigDecimal num;
		int ep, sta, end, i;
		String st;
		while (cin.hasNext()) { // 相当于c++的！=EOF。
			num = cin.nextBigDecimal();
			ep = cin.nextInt();
			num = num.pow(ep); // 计算num^ep。
			st = new String(num.toPlainString()); // toString()会有科学记数法。
			sta = 0;
			while (st.charAt(sta) == '0')
				sta++; // 去掉前缀的0。
			end = st.length() - 1;
			while (st.charAt(end) == '0')
				end--; // 去掉后缀的0。
			if (st.charAt(end) == '.')
				end--; // 若小数点后没0，去掉小数点。
			for (i = sta; i <= end; i++)
				System.out.print(st.charAt(i));
			System.out.println();
		}
		System.exit(0);
	}
}