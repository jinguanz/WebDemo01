package cmu.edu.jinguanz.google;

import java.util.HashMap;

/**
 * Given a seria of points (Xi, Yi), find the line containing the highest number of points from the list. 
 * Per my question he mentioned that I can assume that there is a given function that 
 * receives two points and returns the a and b of the line euqation (aX+b)
 * Select a line which have the most points in the series.
 * @author jinguangzhou
 *
 */

public class HighestPoints {
	
	public Line getHighestLine(HashMap<Integer,Integer> map){
		HashMap<Line,Integer> line = new HashMap<Line,Integer>();
		for(Integer x:map.keySet()){
			Integer y=map.get(x);
			Point point = new Point(x,y);
			Line newLine=getLine(point);
			if(line.containsKey(newLine)){
				int count=line.get(newLine);
				line.put(newLine, count++);
			}else{
				line.put(newLine, 0);
			}
		}
		//find the line which have the highest count
		int maxCount=0;
		Line highestLine=null;
		for(Line l:line.keySet()){
			int currentCount=line.get(l);
			if(currentCount>maxCount){
				maxCount=currentCount;
				highestLine=l;
				currentCount=0;
			}
		}
		return highestLine;
	}
	
	
	
	
	
	public Line getLine(Point p){
		//get slope and intercept
		return null;
	}
	
	
	public static void main(String args[]){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
		
	}
	class Point{
		double x;
		double y;
		public Point(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	
	class Line{
		double slope;
		double intercept;
		public Line(double slope,double intercept){
			this.slope=slope;
			this.intercept=intercept;
		}
	}

}
