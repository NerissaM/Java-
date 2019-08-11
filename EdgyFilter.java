/*This file creates an Edgy Filter file. 
 * This file was created by Kelly Eames and Nerissa Metully for CSC 142 Summer 2019. 
 * The file uses a 3X3 grid to modify the pixels, which are shifted to create the sharpening effect.*/

public class EdgyFilter implements Filter 
{
	public void filter(PixelImage theImage)		
	{
		// Code for doing the negative conversion
		Pixel[][] pArr = theImage.getData();
		int[][] coefArr = {{-1, -1, -1}, {-1, 9, -1}, {-1, -1, -1}};
		int redSum;
		int blueSum;
		int greenSum;

		for (int row = 1; row < theImage.getHeight()-1; row++)
	    {
			for (int col = 1; col < theImage.getWidth()-1; col++)
			{
				redSum = (pArr[row - 1][col - 1].red * coefArr[0][0])
		    		   + (pArr[row - 1][col].red     * coefArr[0][1])
		    		   + (pArr[row - 1][col + 1].red * coefArr[0][2])
		    		   + (pArr[row][col - 1].red     * coefArr[1][0])
		    		   + (pArr[row][col].red         * coefArr[1][1])
		    		   + (pArr[row][col + 1].red     * coefArr[1][2])
		    		   + (pArr[row +1][col - 1].red  * coefArr[2][0])
		    		   + (pArr[row + 1][col].red     * coefArr[2][1])
		    		   + (pArr[row + 1][col + 1].red * coefArr[2][2]);
		    	 
		    	if (redSum < 0)
		    	{
		    		redSum = 0;
		    	}
		    	else if (redSum > 255)
		    	{
		    		redSum = 255;
		    	}
		    	
				greenSum = (pArr[row - 1][col - 1].green   * coefArr[0][0])
			    		   + (pArr[row - 1][col].green     * coefArr[0][1])
			    		   + (pArr[row - 1][col + 1].green * coefArr[0][2])
			    		   + (pArr[row][col - 1].green     * coefArr[1][0])
			    		   + (pArr[row][col].green         * coefArr[1][1])
			    		   + (pArr[row][col + 1].green     * coefArr[1][2])
			    		   + (pArr[row +1][col - 1].green  * coefArr[2][0])
			    		   + (pArr[row + 1][col].green     * coefArr[2][1])
			    		   + (pArr[row + 1][col + 1].green * coefArr[2][2]);
				
		    	if (greenSum < 0)
		    	{
		    		greenSum = 0;
		    	}
		    	else if (greenSum > 255)
		    	{
		    		greenSum = 255;
		    	}
		    	
			    blueSum = (pArr[row - 1][col - 1].blue * coefArr[0][0])
					   + (pArr[row - 1][col].blue      * coefArr[0][1])
					   + (pArr[row - 1][col + 1].blue  * coefArr[0][2])
					   + (pArr[row][col - 1].blue      * coefArr[1][0])
					   + (pArr[row][col].blue          * coefArr[1][1])
					   + (pArr[row][col + 1].blue      * coefArr[1][2])
					   + (pArr[row +1][col - 1].blue   * coefArr[2][0])
					   + (pArr[row + 1][col].blue      * coefArr[2][1])
					   + (pArr[row + 1][col + 1].blue  * coefArr[2][2]);
						    	 
				if (blueSum < 0)
				{
					blueSum = 0;
			    }
			    else if (blueSum > 255)
				{
			    	blueSum = 255;
				}
			
				pArr[row][col].red   = redSum;
				pArr[row][col].blue  = blueSum;
				pArr[row][col].green = greenSum;
		    }
	    }
		theImage.setData(pArr);
	}
}

