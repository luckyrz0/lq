
# 按装github步骤，显示hero ，实现转向
## 安装环境i


## 创建项目

- C:\Users\Administrator\j2mewtk\2.5.2\apps


- 标识符、变量、运算符、流程控制、方法、数组：游戏案例


- AI：人工智能


## 1.1 显示hero到屏幕上
- Image img1;
- img1=Image.createImage("/sayo10.png");
- g.drawImage(imag1,120,120,0);


## 1.2 让hero实现转向
``` java
Image img1,img2,img3,img4,currentimg;
img1=Image.createImage("/sayo10.png");
img2=Image.createImage("/sayo12.png");
img3=Image.createImage("/sayo14.png");
img4=Image.createImage("/sayo16.png");
currentimg=img1;
g.drawImage(currentimg,120,120,0);
int action=getGameAction(keyCode);
		if(action==LEFT){
			currentimg=img2;
			repaint();
		}
		else if(action==RIGHT){
			currentimg=img4;
			repaint();
		}
		else if(action==UP){
			currentimg=img3;
			repaint();
		}
		else if(action==DOWN){
			currentimg=img1;
			repaint();
		}
```

## 代码上传到github的步骤

1. git clone  蓝桥地址

2. cd 仓库名称

3. 按日期创建目录，例如11-14

4. 拷贝AI目录到11-14号里面

5. git add 11-14

6. git commit -m "显示hero、实现转向"

7. git push（会提示输入github的用户名和密码）