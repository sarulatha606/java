package java3;

class AverageCalculate implements Runnable {
	    private final int[] marks;

	    // Constructor to initialize marks
	     AverageCalculate(int[] marks) {
	        this.marks = marks;
	    }

	    public void run() {
	        int sum = 0;
	        for (int mark : marks) {
	            sum += mark;
	        }
	        double average = sum / (double) marks.length;
	        System.out.println("Average of the 5 subjects: " + average);
	    }
	}

	public class CalculateAverage {
	    public static void main(String[] args) {
	        // Marks of 5 subjects
	        int[] marks = {85, 90, 78, 92, 88};

	        // Create a thread for calculating the average
	        Thread averageThread = new Thread(new AverageCalculate(marks));

	        // Start the thread
	        averageThread.start();
	    }
	}


