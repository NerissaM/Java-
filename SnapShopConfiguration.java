/*This file configures attached files.
 * This file was used by Kelly Eames and Nerissa Metully for CSC 142 Summer quarter 2019.
 * 	In addition to the 3 simple filers and the Gaussian blur, Laplacian, Unsharp Masking, and Edgy filters 
 * we elected to make a 5X5 filter 
•	what works and what doesn’t 
•	the surprises or problems you encountered while implementing the transformations. */


/**
 * A class to configure the SnapShop application
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("C:\\Users\\neris\\Desktop\\EclipseCsc142\\Snap Shop\\src\\billg.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
    theShop.addFilter(new FlipVerticalFilter(), "Vertical Filter");
    theShop.addFilter(new NegativeFilter(), "Negative Filter");
    theShop.addFilter(new GaussianFilter(), "Gaussian Filter");
    theShop.addFilter(new LaplacianFilter(), "Laplacian Filter");
    theShop.addFilter(new UnsharpMaskingFilter(), "Unsharp Masking Filter");
    theShop.addFilter(new EdgyFilter(), "Edgy Filter");
    
  }
  
}