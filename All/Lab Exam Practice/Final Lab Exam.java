//	Name: Amjad Ali
//	CMS ID: 023-19-013
//	Final Lab Exam IET
//	Data Structure
//	Sir Saif Hassan





public class MyHashTable {
    
    int currentSize, maxSize;
    String[] password;

   
    MyHashTable (int maxCap)
    {
        this.currentSize = 0;
        this.maxSize = maxCap;
        this.password = new String[maxSize];
 
    }
    
    public void MakeEmpty()
    {
        this.currentSize = 0;
        this.password = new String[this.maxSize];
       
    }
    
    public int Size()
    {
        return this.currentSize;
    }
    
    public boolean isFull()
    {
        return this.currentSize==this.maxSize;
    }
    
    public boolean isEmpty()
    {
        return this.currentSize==0;
    }
    
    public int getHashCode(String name)
    {
        return Math.abs(name.hashCode() % this.maxSize);
    }
    
    public boolean comparePassword(String value)
    {
        int chk = this.getHashCode(value);
        while(password[chk] != null)
    {
        if(password[chk].equals(value))
            return true;
        chk = (chk + 1) % this.maxSize;
    }
        return false;
    }
    
    public boolean contains(String value)
    {
        return comparePassword(value) != false;
    }
    
    public void AddData(String value)
    {
        int temp = getHashCode(value);
        int chk = temp;
        do
        {
            if (this.password[chk] == null)
            {
                this.password[chk] = value;
                currentSize++;
                return;
            }
            if (password[chk].equals(value))
            {
                password[chk] = value;
                return;
            }            
                chk = (chk + 1) % maxSize;            
        } while (chk != temp);   
    }
         
    public void remove(String value)
    {
       if (!contains(value))
           return;
       
       int i = getHashCode(value);
       while (!value.equals(password[i]))
           i = (i + 1) % maxSize;        
       password[i] = null;
       
  
       for (i = (i + 1) % maxSize; password[i] != null; i = (i + 1) % maxSize)
       {
           String tmp1 = password[i];
           password[i] = null;
         
           currentSize--;  
           AddData(tmp1);            
       }
       currentSize--;        
   }   
    
   public void Display()
   {
       System.out.println("\nHash Table: ");
       for (int i = 0; i < maxSize; i++)
  
               System.out.println(i+"\t"+password[i]);
       System.out.println();
   }
   
   
    public static void main(String[] args) {
    	MyHashTable T1 = new MyHashTable(10);
    	T1.AddData("IBA");
    	T1.AddData("IET");
    	T1.AddData("Data");
    	T1.AddData("Structure");
    	T1.AddData("Samad");
    	T1.AddData("Aziz");
    	T1.Display();
    	System.out.print(T1.comparePassword("Samad"));
    	T1.remove("Aziz");
    	T1.Display();
       
     
    }
}
