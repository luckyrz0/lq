# 实现hero的移动，和正常移动
1. - 设置上下左右的移动的变量，并加入图片
```java
Image img,imglfet,currentImg,
imgup,imgright,img1,img2,img3,img4,
img5,img6,img7,img8;
img=Image.createImage("/sayo10.png");
imglfet=Image.createImage("/sayo12.png");
imgup =Image.createImage("/sayo14.png");
imgright =Image.createImage("/sayo16.png");
img1=Image.createImage("/sayo02.png");
img2=Image.createImage("/sayo22.png");
img3=Image.createImage("/sayo20.png");
img4=Image.createImage("/sayo24.png");
img5=Image.createImage("/sayo26.png");
img6=Image.createImage("/sayo06.png");
img7=Image.createImage("/sayo04.png");
img8=Image.createImage("/sayo00.png");
```
2. - 定义变量 x，y代表hero的移动坐标，n代表着图片的切换，并给出相应的赋值
```java
int n;
int x;
int y;
x=120;
y=100;
n=0;
g.drawImage(currentImg,x,y,0);
```
3. - 实现图片的正常移动
```java
if(action==LEFT){
	if(n==0){
	 currentImg=imglfet;
	 n=1;
			}
else if(n==2){
	currentImg=img2;
	x--;
	n=0;			
			}
	else if(n==1){
	currentImg=img1;	
	x--;	
	n=2;
			}
  repaint();	
		}
```
- 其它三个方向同理
