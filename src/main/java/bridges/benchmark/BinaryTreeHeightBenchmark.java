package bridges.benchmark;

import java.util.ArrayList;

import bridges.base.DataStruct;
import bridges.base.LineChart;
import edu.ithaca.dragon.datastructures.tree.BTNode;
import edu.ithaca.dragon.datastructures.tree.BTNodeUtil;

public class BinaryTreeHeightBenchmark extends Benchmark {

	public BinaryTreeHeightBenchmark(int rounds, int itemsPerRound) {
    	super(new LineChart());
    	plot.setTitle("Binary Tree Height Benchmark");
		plot.setXLabel("Amount of Data in tree");
        plot.setYLabel("Height");
        
        String lineName = "BinaryTree";
        BTNode root = new BTNode(0);
	
		ArrayList<Double> xDataPoints = new ArrayList<>();
		ArrayList<Double> yDataPoints = new ArrayList<>();
		for (int i=1; i < rounds; i++){
			addHeightPoint(i, itemsPerRound, root, xDataPoints, yDataPoints);
		}
		plot.setXData(lineName, xDataPoints);
		plot.setYData(lineName, yDataPoints);
	}

	public static void addHeightPoint(int roundNumber, int numPushes, BTNode root, ArrayList<Double> xDataPoints, ArrayList<Double> yDataPoints ) {
		for (int i=0; i<numPushes; i++){
			BTNodeUtil.add(root, (roundNumber*numPushes) + i);
		}
		xDataPoints.add(Double.valueOf(roundNumber*numPushes));
		yDataPoints.add(Double.valueOf(BTNodeUtil.height(root)));
	}

	public DataStruct getViewableModel(){
		return plot;
	}
    
}
