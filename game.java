class game
{
public static void main(string a[])
{
int move,x=0,y=0;
int b [] [] ;
b=new int [3] [3];
b [] []={1,0,0,0,0,7,0,0,0,0,7,0,0,0,0,9};
display.disp();
START:
System.out.println("Enter your choice 1.up 2.down 3.left 4.right");
DataInputStream move=new DataInputStream();
move=Integer.parseInt(din.readline());
switch(move)
{
case 1:
x=x-1;
if(x<0)
{
System.out.print("Cannot move");
continue START;
}
else if(checker.check()==0)
{
System.out.println("You lost");
}
else if(checker.check()==1)
{
System.out.println("you won");
}
else
{
b[x+1][y]=0;
b[x][y]=1;
display.disp();
trapmv.trap();
}
break;
case 2:
x=x+1;
if(x>3)
{
System.out.print("Cannot move");
continue START;
}
else if(checker.check()==0)
{
System.out.println("You lost");
}
else if(checker.check()==1)
{
System.out.println("you won");
}
else
{
b[x-1][y]=0;
b[x][y]=1;
display.disp();
trapmv.trap();
}
break;
case 3:
y=y-1;
if(y<0)
{
System.out.print("Cannot move");
continue START;
}
else if(checker.check()==0)
{
System.out.println("You lost");
}
else if(checker.check()==1)
{
System.out.println("you won");
}
else
{
b[x][y+1]=0;
b[x][y]=1;
display.disp();
trapmv.trap();
}
break;
case 4:
y=y+1;
if(y>3)
{
System.out.print("Cannot move");
continue START;
}
else if(checker.check()==0)
{
System.out.println("You lost");
}
else if(checker.check()==1)
{
System.out.println("you won");
}
else
{
b[x][y-1]=0;
b[x][y]=1;
display.disp();
trapmv.trap();
}
break;
}
}
}
class display
{
int i,j;
void disp()
{
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]);
System.out.print("\t");
}
System.out.println("  ");
}}}
class checker
{
int check()
{
if(a[x][y]==7)
{
return 0;
}
else if(a[x][y]==9)
{
return 1;
}
}
}
class trapmv
{
int l,m;
void trap()
{
for(l=0;l<3;l++)
{
for(m=0;m<3;m++)
{
if(b[l][m]==7)
{
b[l][m]=0;
l=l+1;
m=m+1;
if(l>3)
{
l=l-1;
}
if(m>3)
{
m=m-1;
}
}
}
b[l][m]=7;
}
}
}











