/*************************************************
 * Name: Joseph White    
 * Date: 10.29.2020
 * Instructor: Krishna Nandanoor
 * Class: CIT 249
 * Program: This program creates a directory using
 * recursion and encrypts/decrypts the directory
 * listing.
 * ************************************************
 */
 
import java.io.File;
import java.util.ArrayList;

public class FileNameEncryption implements Encryptable
{		

	/* ---------------------------------------------------------------------------
	 *	Class Data:
	 *
	 *  fullDirectory:   Formatted output which represents the directory structure
	 *	directorList[ ]: Array of File objects for the directory structure
	 *  isEncrypted:     Indicates whether or not the fullDirectory is encrypted
	 * --------------------------------------------------------------------------*/

    private String fullDirectory = "";
	private File directoryList[ ];
	private boolean isEncrypted;
	ArrayList<Character> cryptoDir = new ArrayList();
	ArrayList<Character> alpha = new ArrayList();
	ArrayList<Character> cryptoAlpha = new ArrayList();
	ArrayList<Integer> index = new ArrayList();
	
	
	 /* ---------------------------------------------------------------------------
	 *	Class constructor 
	 *
	 *	The directory is validated and then a File array is created if valid.
	 *  The createFullDirectory method is called to create the formatted display of
	 *  of the directory.
	 *
	 *  Students are not permitted to change this constructor.
	 *
	 * --------------------------------------------------------------------------*/	

    public FileNameEncryption(String path)
    {
                  
		if(path != null && path != "")
		{	
			File maindir = new File(path);
			
			if	(  maindir.exists() && maindir.isDirectory()  ) 
			{	directoryList = maindir.listFiles(); 
				fullDirectory = "";
				createFullDirectory(0);
				isEncrypted = false;
			}
		}
	}
	
	
	/* ---------------------------------------------------------------------------
	 *	This is to be a RECURSIVE method
	 *		Do NOT change the parameters or returned data type
	 *
	 *  NOTE: Recursion should not be used for files in the structure. 
	 *        Recursion is only used on the folders in the structure. 
		 *
	 *  Parameters:
	 *		directory: A File object which is an array of File objects (files and folders)
	 *	    index:     An index for the array
	 *
	 *  Do not include repetition structures in the method.  Repetition is handled
	 *  through recursion.
	 * --------------------------------------------------------------------------*/
		
    /**********************************************
     * creating directory using recursion
     * ********************************************
     */
	private void createFullDirectory(int index)  
     { 		
		
		if (index == directoryList.length)
		{
			System.out.println("");
			return;
		}
		else
		{
			if (directoryList[index].isDirectory())
			{
				this.fullDirectory = this.fullDirectory + directoryList[index].getName();
			System.out.print("FOLDER: " + "[" + directoryList[index].getName() + "]" + "\n");
			}
			else
			{
				this.fullDirectory = this.fullDirectory + directoryList[index].getName();
				System.out.print("FILE: " + directoryList[index].getName() + "\n");
			}
			createFullDirectory(index + 1);
		}
		

 	 }  

	 /* ---------------------------------------------------------------------------
	 *	Accessors for fullDirectory and isEncrypted
	 * --------------------------------------------------------------------------*/	
	
	public String getFullDirectory()
	{
		return fullDirectory;
	}
	public boolean directoryIsEncrypted()
	{
		return isEncrypted;
	}
	
	/* ---------------------------------------------------------------------------
	 *	encrypt method for fullDirectory - To be completed by student
	 *
	 * --------------------------------------------------------------------------*/	
		
	public void encrypt()
	{ 
		
		/*********************************************
		 * Created an ecryption method that kind of works
		 * *******************************************
		 */
		char[] plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz 0123456789.".toCharArray();
		char[] key = "SPECIAL 319".toCharArray();
		char[] s = this.fullDirectory.toCharArray();
		int [] index1 = new int[s.length];
		
		ArrayList<Character> keyList = new ArrayList();
		
		ArrayList<Character> dir = new ArrayList();
		

		
		
		for (int i = 0;i < plain.length;i++)
		{
			this.alpha.add(plain[i]);
		}
		for (int i = 0;i < key.length; i++)
		{
			keyList.add(key[i]);
		}
		for (int i = 0;i < s.length;i++)
		{
			dir.add(s[i]);
		}
		
		for (int i = 0;i < this.alpha.size();i++)
			for (int j = 0; j < keyList.size();j++)
			{
				if (this.alpha.get(i) == keyList.get(j))
				{
					this.alpha.remove(keyList.get(j));
				}
			}
		cryptoAlpha.addAll(keyList);
		cryptoAlpha.addAll(this.alpha);
		this.alpha.clear();
		for (int i = 0;i < plain.length;i++)
		{
			this.alpha.add(plain[i]);
		}
		for (int i = 0;i < dir.size();i++)
			for(int j = 0;j < this.alpha.size(); j++)
			{
				if (dir.get(i) == this.alpha.get(j))
				{
					index1[i] = this.alpha.indexOf(dir.get(i));
					this.index.add(this.alpha.indexOf(dir.get(i)));
				}
			}
			
			for (int i = 0;i < this.index.size();i++)
				
			{
					//System.out.print(x[i] + ", ");
				try {
					this.cryptoDir.add(cryptoAlpha.get(this.index.get(i).intValue()));
				}
				catch(Exception e){
					
				}
				finally {
					StringBuilder builder = new StringBuilder();
					for (Character c : this.cryptoDir) {
					    builder.append(c.toString());
					}
					this.fullDirectory = builder.toString();
					this.isEncrypted = true;
				}
			}

		
	
	}

	/* ---------------------------------------------------------------------------
	 *	decrypt method for fullDirectory - To be completed by student
	 *
	 * --------------------------------------------------------------------------*/	
   
    public void decrypt()
	{
    	/**************************************
    	 * Creating a decryption method that 
    	 * kind of works, but the output is a bit
    	 * messy. I couldn't find a good way to 
    	 * rebuild the original file structure
    	 * ************************************
    	 */
    	this.cryptoDir.clear();
    	for (int i = 0;i < this.index.size();i++)
			
		{
				//System.out.print(x[i] + ", ");
			try {
				this.cryptoDir.add(this.alpha.get(this.index.get(i).intValue()));
			}
			catch(Exception e){
				
			}
			finally {
				StringBuilder builder = new StringBuilder();
				for (Character c : this.cryptoDir) 
				{
				    builder.append(c.toString());
				}
				this.fullDirectory = builder.toString();
				this.isEncrypted = false;
			}
		}
	}

}


    