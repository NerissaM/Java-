// This file is a Negative Filter subtracting max RBG values from each pixel value. 
public class LaplacianFilter implements Filter {
	
	  public void filter(PixelImage pi)		{
// Code for doing the negative conversion
		{
			Pixel[][] pArr = pi.getData();
			int[][] lapArr = {{-1,-1, -1}, {-1,-8,-1}, {-1,-1,-1}};
			int redSum;
			int blueSum;
			int greenSum;

		    for (int row = 1; row < pi.getHeight()-1; row++)
		    {
		      for (int col = 1; col < pi.getWidth()-1; col++)
		      {
		    	 redSum= ((pArr[row - 1][col - 1].red) * (lapArr[0][0]))
		    		+ (pArr[row - 1][col ].red) * (lapArr[0][1])
		    		+ (pArr[row - 1][col + 1].red) * (lapArr[0][2])
		    		+ (pArr[row][col - 1].red) * (lapArr[1][0])
		    		+ (pArr[row][col ].red) * (lapArr[1][1])
		    		+ (pArr[row][col + 1].red) * (lapArr[1][2])
		    		+ (pArr[row +1][col - 1].red) * (lapArr[2][0])
		    		+ (pArr[row + 1][col ].red) * (lapArr[2][1])
		    		+ (pArr[row + 1][col + 1].red) * (lapArr[2][2]);
		    	 
		    	 
		    	 if (redSum < 0) {
		    		 redSum = 0;
		    	 }
		    	 else if (redSum > 255) {
		    		 redSum = 255;
		    	 }
		    	pArr[row][col].red = redSum;
		    
		    	
		      	 
		    	 blueSum= ((pArr[row - 1][col - 1].blue) * (lapArr[0][0]))
				    		+ (pArr[row - 1][col ].blue) * (lapArr[0][1])
				    		+ (pArr[row - 1][col + 1].blue) * (lapArr[0][2])
				    		+ (pArr[row][col - 1].blue) * (lapArr[1][0])
				    		+ (pArr[row][col ].blue) * (lapArr[1][1])
				    		+ (pArr[row][col + 1].blue) * (lapArr[1][2])
				    		+ (pArr[row +1][col - 1].blue) * (lapArr[2][0])
				    		+ (pArr[row + 1][col ].blue) * (lapArr[2][1])
				    		+ (pArr[row + 1][col + 1].blue) * (lapArr[2][2]);
				    		
			    	 if (blueSum < 0) {
			    		 blueSum = 0;
			    	 }
			    	 else if (blueSum > 255) {
			    		 blueSum = 255;
			    	 }
			    	pArr[row][col].blue = blueSum;
			    	
			    	 greenSum= ((pArr[row - 1][col - 1].green) * (lapArr[0][0]))
				    		+ (pArr[row - 1][col ].green) * (lapArr[0][1])
				    		+ (pArr[row - 1][col + 1].green) * (lapArr[0][2])
				    		+ (pArr[row][col - 1].green) * (lapArr[1][0])
				    		+ (pArr[row][col ].green) * (lapArr[1][1])
				    		+ (pArr[row][col + 1].green) * (lapArr[1][2])
				    		+ (pArr[row +1][col - 1].green) * (lapArr[2][0])
				    		+ (pArr[row + 1][col ].green) * (lapArr[2][1])
				    		+ (pArr[row + 1][col + 1].green) * (lapArr[2][2]);
				    		
				    		
					    	 if (greenSum < 0) {
					    		 greenSum = 0;
					    	 }
					    	 else if (greenSum > 255) {
					    		 greenSum = 255;
					    	 }
					    	pArr[row][col].green = greenSum;
					    	
			      }
		    }
		    

		    pi.setData(pArr);
	}
}
}
