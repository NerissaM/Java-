// This file is a Negative Filter subtracting max RBG values from each pixel value. 
public class NegativeFilter implements Filter {
	
	  public void filter(PixelImage pi)		{
// Code for doing the negative conversion
		{
			Pixel[][] pArr = pi.getData();

		    for (int row = 0; row < pi.getHeight(); row++)
		    {
		      for (int col = 0; col < pi.getWidth(); col++)
		      {
		    	  pArr[row][col].red = 255 - pArr[row][col].red;
		    	  pArr[row][col].green = 255 - pArr[row][col].green;
		    	  pArr[row][col].blue = 255 - pArr[row][col].blue;
		      }
		    }

		    pi.setData(pArr);
	}
}
}