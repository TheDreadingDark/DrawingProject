package art.controller;

import javax.swing.JOptionPane;
import art.view.ArtFrame;

public class ArtController
{
	private ArtFrame appFrame;
	
	public void start()
	{
		appFrame = new ArtFrame(this);
		JOptionPane.showMessageDialog(appFrame,  "Welcome to art!");
	}
	
	public ArtFrame getArtFrame()
	{
		return appFrame;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
}
