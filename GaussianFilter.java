/*This file is a Gaussian Filter file. 
 * This file was created by Kelly Eames and Nerissa Metully for CSC 142 Summer 2019. 
 * The file uses a 3X3 grid to modify the pixels, which are shifted to create the Gaussian effect.*/

public class GaussianFilter implements Filter {
	
	  public void filter(PixelImage theImage)		{
// Code for doing the negative conversion
		{
			Pixel[][] pArr = theImage.getData();
			int[][] lapArr = {{1, 2, 1}, {2, 4, 2}, {1, 2, 1}};
			
			int redSum;
			int blueSum;
			int greenSum;

		    for (int row = 1; row < theImage.getHeight()-1; row++)
		    {
		      for (int col = 1; col < theImage.getWidth()-1; col++)
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
		    	 
		    	 
		    	 redSum = redSum / 16;
		    			 
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
				    	
		    	 
		    	 	blueSum = blueSum / 16;
			    	 
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
				    		
				    		
			    	 	greenSum = greenSum / 16;
			    	 	
			    	 	
					    	pArr[row][col].green = greenSum;
					    	
			      }
		    }
		    

		    theImage.setData(pArr);
	}
}
}
