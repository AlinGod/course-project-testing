/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.util.*;

public class Graf {

List[]  mas ;/* вершины */
int[][] matrix;
int num_el = 0;

Graf(int i)
{
    mas = new  List[i];
    for(int c = 0; c < i; c++)
        mas[c] = null;
    matrix = new int[i][i];
    for(int a = 0; a < i; a++)
        for(int b = 0; b < i; b++)
            matrix[a][b] = 0;
}

public int add_mas(List A)// добавление в граф нового листа
{
    if(A != null){
    A.num = num_el++;
    mas[A.num] = A;
    return 0;
    }
    return 1;
}
public int add_matrix( List A, List B)//добавление зависимостей листов
{
    if(A != null && B != null){
        if(A.num != -1 && B.num != -1){
            matrix[A.num][B.num] = 1;
            matrix[B.num][A.num] = 1;
            return 0;
        }
        else 
            return 1;

    }
    return 1;
}

public List search(javatest.List Head, int c)// поиск листа по значению
{
   if(Head == null)
       return null;
   else
   {
       QGR Que = new QGR(mas.length);
       Que.ins(Head);
       int i = Head.num;
       javatest.List cur = Que.getFront();
       mas[i].flag = true;
        while(Que.size() != 0){ 
                if(cur.n != c){
  
                    int x = cur.num;
                    int y = 0;
                    while(y != num_el)
                    {
                        if(matrix[x][y] == 1 && mas[y].flag != true)
                        {
                            mas[y].prev = cur;
                            mas[y].flag = true;
                            Que.ins(mas[y]);
                            
                        }
                        y++;
                    }
                }
                else
                    break;
             Que.remove();
            cur = Que.getFront();
       }
        return cur;
   }
    
//    QGR Que = new QGR(mas.length);
//    javatest.List cur = Head;// добавление в очередь 
//    if (Head != null){
//        Head.flag = true;
//        Que.ins(Head);
//        while(Que.size() != 0 && cur.n != c)// пока очередь не 0 и пока не найдено число
//        {
//            int x = cur.num;// количество вершин
//            int y = num_el - 1 ;
//            cur.flag = true;
//            while( x != y )
//            {
//                if(matrix[x][y] == 1 && mas[y].flag != true)
//                {
//                    mas[y].prev = cur; 
//                    Que.ins(cur);
//                    cur.flag = true;
//                }
//                y--;
//            }
//            Que.remove();
//            cur = Que.getFront();
//        }
//    }
// return cur;
}

public void Nul_flag()//обнуление флагов
{
    int i = 0;
    while(i != num_el)
        mas[i++].flag = false;
}


}