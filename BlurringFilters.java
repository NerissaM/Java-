public class BlurringFilters  
{

	//first method to access the whole image
	public void Blurring (PixelImage theImage, int unique [][]) 
	{
		Pixel[][] pArr = theImage.getData();
		
		for (int row = 1; row < theImage.getHeight()-1; row++) 
		{
			for (int col = 1; col < theImage.getWidth()-1; col++) 
			{
				Pixel Neighborhood [][]= {{pArr[row-1][col-1], pArr[row-1][col]}}; //remember to complete remainder from another of the filters
				WeightedAverage(unique, Neighborhood);
			}
	    } 
	}
	
	
	//second method calculates wA. 
	public void WeightedAverage(int unique [][], Pixel Neighborhood [][]) 
	{
		int redSum = 0;
		int blueSum = 0;
		int greenSum = 0;
		for( int row = 0; row <= 2; row++ ) 
		{
			for (int col =0; col <= 2; col ++)
			{
				redSum += unique[row][col] * Neighborhood [row][col].red;
				blueSum += unique[row][col] * Neighborhood [row][col].blue;
				greenSum += unique[row][col] * Neighborhood [row][col].green;
			}
		}	
	}
}


