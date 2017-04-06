package org.it.tdt.edu.vn.io;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.it.tdt.edu.vn.utils.Utils;

/**
 * 
 * @author hmtrung This class use to get image file from resources and have one
 *         method process to return BufferedImage
 */
public class OriginalImage {

	private String imageUrl;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public OriginalImage() {
	}

	public OriginalImage(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * 
	 * @return bufferedImage
	 *         <p>
	 *         Get image original from resources directory
	 *         </p>
	 */

	public BufferedImage getImageFromResourcesDirectory() {

		if (imageUrl != null && !imageUrl.isEmpty() && imageUrl != "") {

			File imageFile = new File(imageUrl);
			BufferedImage bufferedImage = null;
			try {
				bufferedImage = ImageIO.read(imageFile);
			} catch (IOException e) {

				System.err.println("Image url don't correct:");
				e.printStackTrace();
			}
			return bufferedImage;
		}
		System.err.println("Image url is empty!");
		return null;
	}

	public static void main(String[] args) {
		OriginalImage image = new OriginalImage(Utils.PATH_IMAGE);
		System.out.println(image.getImageFromResourcesDirectory());
	}
}
