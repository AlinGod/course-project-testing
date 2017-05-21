/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;
import java.util.List;
/**
 *
 * @author acer
 */
public class QGR {// очередь
    javatest.List[] queue;
    int maxSize; 
    int front;//first element
    int rear;
    int nElem;

    QGR(int max)
    {
        this.maxSize = max;
        queue = new javatest.List[max];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    
    void ins(javatest.List el)// добавление в очередь
    {
            if(el != null){
            if(rear == maxSize - 1)
                rear = - 1;

            queue[++rear] = el;
            nElem++;
        }
    }
    javatest.List remove()// удаление 1го элемента
    {
       
        javatest.List temp = queue[front++];
        
        if(front == maxSize)
            front = 0;
        nElem--;
        return temp;
    }

    int size()//размер очереди
    {
        return nElem;
    }   
    
    javatest.List getFront()// первый элемент в очереди
    {   {if(nElem != 0)
            return queue[front];
        }
        return null;
    }
    
    
}
