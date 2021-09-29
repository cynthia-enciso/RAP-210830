package examples;

import examples.pens.MarkerPen;
import examples.pens.Pen;
import examples.pens.WritingTool;

public class Main {
	public static void main(String[] args) {
//		WritingTool obj = new WritingTool();
//		Pen pen = new Pen();
//		pen.write();
		
		MarkerPen mp = new MarkerPen();
		mp.isPurchasable();
		mp.isRefillable();
		mp.defaultMethod();
	}
}
