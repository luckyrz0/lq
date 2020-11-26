import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;
import java.util.Random;
public class AI extends MIDlet
{
	Display display;
	MainCanvas mc;
	public AI(){
		display=Display.getDisplay(this);
		mc=new MainCanvas();
		display.setCurrent(mc);
	}
	public void startApp(){
	}
	public void destroyApp(boolean unc){
	}
	public void pauseApp(){
	}
}
class MainCanvas extends Canvas implements Runnable
{
	Image[][] heroImg =new Image[4][3];
		Image curImg;
		int heroX,heroY;
		int flag =0;
		Image bossImg;
        int bossX,bossY;
        Thread thread;
		Random random =new Random();
       
	public MainCanvas(){
		try{
			for(int i=0;i<heroImg.length;i++){
               for(int j=0;j<heroImg[i].length;j++){
                heroImg[i][j] = Image.createImage("/sayo"+i+j+".png");
			   }
			}
			bossImg = Image.createImage("/zuzu000.png");
			curImg =heroImg[3][1];
			heroX =100;
			heroY =200;
			bossX =0;
			bossY =0;
			thread = new Thread(this);
			thread.start();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
      public void run(){
		 for(;;){
		  int t =random.nextInt(10);
		 try{
		   thread.sleep(300);
		 }
      catch(InterruptedException e){
				e.printStackTrace();
			}
			if(t%3==0){
             if(bossX>heroX){
                bossX--;
			 }else{
			    bossX++;
			 }
              if(bossY>heroY){
                bossY--;
			 }else{
			    bossY++;
			 }
            repaint();
			}
		 }
	 }
	public void paint(Graphics g){
		g.setColor(250,200,180);
		g.fillRect(0,0,getWidth(),getHeight());
	    g.drawImage(curImg,heroX,heroY,0);
		g.drawImage(bossImg,bossX,bossY,0);
	}
	
	public void keyPressed(int keyCode){
		int action=getGameAction(keyCode);

		if(action==LEFT){
        picAndmove(0);
		heroX-=3;
		}
		if(action==RIGHT){
        picAndmove(1);
		heroX+=3;
		}
		if(action==UP){
        picAndmove(2);
		heroY-=3;
		}
        if(action==DOWN){
		picAndmove(3);
		heroY+=3;
		}


	}
	 public void picAndmove(int turn){
        if(flag ==0){
		   curImg=heroImg[turn][0];
		   flag=1;
		}
	    else if(flag==1){
           curImg=heroImg[turn][2];
		   flag=0;
		}
		repaint();
		}
}