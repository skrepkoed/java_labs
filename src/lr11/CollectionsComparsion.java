package lr11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeMap;

public class CollectionsComparsion {
    final static long NUMBER_OF_ELEMENTS=12_000_000;
    public static void main(String[] args) {
        arrayListVsTreeMapVsArrayDequeInsertionAtBegining();
        arrayListVsTreeMapVsArrayDequeInsertionAtEnd();
        arrayListVsTreeMapVsArrayDequeInsertionAtMiddle();
        arrayListVsTreeMapVsArrayDequeRemoveFirst();
        arrayListVsTreeMapVsArrayDequeRemoveLast();
        arrayListVsTreeMapVsArrayDequeRemoveMiddle();
        arrayListVsTreeMapVsArrayDequegetByIndex();
         
        
    }

    public static void arrayListVsTreeMapVsArrayDequeInsertionAtBegining() {
        System.out.println("Add first to TreeMap: "+addFirstAtTreeMapTest());
        System.out.println("Add first to ArrayList: "+addFirstArrayListTest());
        System.out.println("Add first to ArrayDeque: "+addFirstArrayDequeTest());
    }
    public static void arrayListVsTreeMapVsArrayDequeInsertionAtEnd() {
        System.out.println("Add last to TreeMap: "+addLastAtTreeMapTest());
        System.out.println("Add last to ArrayList: "+addLastArrayListTest());
        System.out.println("Add last to ArrayDeque: "+addLastArrayDequeTest());
    }
    public static void arrayListVsTreeMapVsArrayDequeInsertionAtMiddle() {
        System.out.println("Add at middle to TreeMap: "+addMiddleAtTreeMapTest());
        System.out.println("Add at middle to ArrayList: "+addMiddleArrayListTest());
        System.out.println("Add at middle to ArrayDeque: "+addMiddleArrayDequeTest());
    }

    public static void arrayListVsTreeMapVsArrayDequeRemoveFirst() {
        System.out.println("Remove first to TreeMap: "+removeFirstTreeMapTest());
        System.out.println("Remove first to ArrayList: "+removeFirstArrayListTest());
        System.out.println("Remove first to ArrayDeque: "+removeFirstArrayDequeTest());
    }

    public static void arrayListVsTreeMapVsArrayDequeRemoveLast() {
        System.out.println("Remove last to TreeMap: "+removeLastTreeMapTest());
        System.out.println("Remove last to ArrayList: "+removeLastArrayListTest());
        System.out.println("Remove last to ArrayDeque: "+removeLastArrayDequeTest());
    }

    public static void arrayListVsTreeMapVsArrayDequeRemoveMiddle() {
        System.out.println("Remove middle to TreeMap: "+removeMiddleAtTreeMapTest());
        System.out.println("Remove middle to ArrayList: "+removeMiddleArrayListTest());
        System.out.println("Remove middle to ArrayDeque: "+removeMiddleArrayDequeTest());
    }

    public static void arrayListVsTreeMapVsArrayDequegetByIndex() {
        System.out.println("Get by Index to TreeMap: "+getIndexAtTreeMapTest());
        System.out.println("Get by Index to ArrayList: "+getIndexArrayListTest());
        System.out.println("Get by Index to ArrayDeque: "+getIndexArrayDequeTest());
    }



    public static ArrayList<Integer> setArrayList(ArrayList<Integer> arrayList) {
        for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
            arrayList.add(i);
        }
        return arrayList;
    }
    public static TreeMap<Integer,Integer> setTreeMap(TreeMap<Integer,Integer> treeMap) {
        for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
            treeMap.put(i, 0);        
        }
        return treeMap;
    }
    public static ArrayDeque<Integer> setArrayDeque(ArrayDeque<Integer> arrayDeque) {
        for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
             arrayDeque.add(i);       
        }
        return arrayDeque;
    }

    public static long addFirstAtTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->addFirstAtTreeMap(x));
        
    }
    public static void addFirstAtTreeMap(TreeMap<Integer,Integer> treeMap) {
        long firstKey=treeMap.firstKey();
        treeMap.put((int)firstKey-1, 1);
    }

    public static long addLastAtTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->addLastAtTreeMap(x));
        
    }
    public static void addLastAtTreeMap(TreeMap<Integer,Integer> treeMap) {
        long firstKey=treeMap.lastKey();
        treeMap.put((int)firstKey+1, 1);
    }

    public static long addMiddleAtTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->addMiddleAtTreeMap(x));
        
    }
    public static void addMiddleAtTreeMap(TreeMap<Integer,Integer> treeMap) {
        Integer newKey = treeMap.size()+1;
        Integer newValue = 2;
        int middleIndex =(int) Math.round(treeMap.size() / 2.0);
        Integer value=treeMap.get(middleIndex);
        treeMap.put(middleIndex, newValue);
        long size=treeMap.size();
        while(middleIndex<size){
            Integer integer=treeMap.get(middleIndex+1);
            treeMap.put(middleIndex+1, value);
            value=integer;
            middleIndex+=1;
        }
        treeMap.put(newKey, value);
    }

    public static long removeFirstTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->removeFirstTreeMap(x));
        
    }
    public static void removeFirstTreeMap(TreeMap<Integer,Integer> treeMap) {
        treeMap.remove(treeMap.firstKey());
    }


    public static long removeLastTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->removeLastTreeMap(x));
        
    }
    public static void removeLastTreeMap(TreeMap<Integer,Integer> treeMap) {
        treeMap.remove(treeMap.lastKey());
    }

    public static long removeMiddleAtTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->removeMiddleAtTreeMap(x));
        
    }
    public static void removeMiddleAtTreeMap(TreeMap<Integer,Integer> treeMap) {
        int middleIndex =(int) Math.round(treeMap.size() / 2.0);
        treeMap.remove(middleIndex);  
    }

    public static long getIndexAtTreeMapTest() {
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>();
        treeMap= setTreeMap(treeMap);
        return getRunningTime(treeMap, (x)->getIndexAtTreeMap(x));
        
    }
    public static void getIndexAtTreeMap(TreeMap<Integer,Integer> treeMap) {
        int middleIndex =(int) Math.round(treeMap.size() / 2.0);
        treeMap.get(middleIndex);  
    }

    public static long addFirstArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->addFirstArrayList(x));
    }
    public static void addFirstArrayList(ArrayList<Integer>  arrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        newArrayList.add(-1);
        for (Integer i : arrayList) {
            newArrayList.add(i);
        }
        arrayList=newArrayList;
    }

    public static long addLastArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->addLastArrayList(x));
    }
    public static void addLastArrayList(ArrayList<Integer>  arrayList) {
        arrayList.add(-1);
    }

    public static long addMiddleArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->addMiddleArrayList(x));
    }
    public static void addMiddleArrayList(ArrayList<Integer>  arrayList) {
        Integer newValue = 2;
        int middleIndex =(int) Math.round(arrayList.size() / 2.0);
        arrayList.add(middleIndex, newValue);
    }


    public static long removeFirstArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->removeFirstArrayList(x));
    }
    public static void removeFirstArrayList(ArrayList<Integer>  arrayList) {
        arrayList.remove(0);
    }


    public static long removeLastArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->removeLastArrayList(x));
    }
    public static void removeLastArrayList(ArrayList<Integer>  arrayList) {
        arrayList.remove(arrayList.size()-1);
    }

    public static long removeMiddleArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->removeMiddleArrayList(x));
    }
    public static void removeMiddleArrayList(ArrayList<Integer>  arrayList) {
        arrayList.remove(arrayList.size()/2);
    }

    public static long getIndexArrayListTest() {
        ArrayList<Integer>  arrayList=new ArrayList<Integer>();
        arrayList=setArrayList(arrayList);
        return getRunningTime(arrayList, (x)->getIndexArrayList(x));
    }
    public static void getIndexArrayList(ArrayList<Integer>  arrayList) {
        arrayList.get(arrayList.size()/2);
    }

    public static long addFirstArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->addFirstArrayDeque(x));
    }


    
    public static void addFirstArrayDeque(ArrayDeque<Integer> arrayDeque) {
        arrayDeque.addFirst(-1);
    }

    public static long addLastArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->addLastArrayDeque(x));
    }
    public static void addLastArrayDeque(ArrayDeque<Integer> arrayDeque) {
        arrayDeque.addLast(-1);
    }
    public static long addMiddleArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->addMiddleArrayDeque(x));
    }
    public static void addMiddleArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long middle=  (arrayDeque.size() / 2);
        long counter=0;
        ArrayDeque<Integer> newDeque = new ArrayDeque<Integer>();
        while(counter<middle){
            newDeque.addLast(arrayDeque.pollFirst());
            counter+=1;
        }
        newDeque.addLast(2);
        newDeque.addAll(arrayDeque);
        arrayDeque=newDeque;
    }

    public static long removeFirstArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->removeFirstArrayDeque(x));
    }

    public static void removeFirstArrayDeque(ArrayDeque<Integer> arrayDeque) {
        arrayDeque.removeFirst();
    }

    public static long removeLastArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->removeLastArrayDeque(x));
    }

    public static void removeLastArrayDeque(ArrayDeque<Integer> arrayDeque) {
        arrayDeque.removeLast();
    }

    public static long removeMiddleArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->removeMiddleArrayDeque(x));
    }

    public static void removeMiddleArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long middle=  (arrayDeque.size() / 2);
        long counter=0;
        ArrayDeque<Integer> newDeque = new ArrayDeque<Integer>();
        while(counter<middle){
            newDeque.addLast(arrayDeque.pollFirst());
            counter+=1;
        }
        newDeque.removeLast();
        newDeque.addAll(arrayDeque);
        arrayDeque=newDeque;
    }

    public static long getIndexArrayDequeTest() {
        ArrayDeque<Integer> arrayDeque= new ArrayDeque<Integer>();
        arrayDeque= setArrayDeque(arrayDeque);
        return getRunningTime(arrayDeque, (x)->removeMiddleArrayDeque(x));
    }

    public static void getIndexArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long middle=  (arrayDeque.size() / 2);
        long counter=0;
        ArrayDeque<Integer> newDeque = new ArrayDeque<Integer>();
        while(counter<middle){
            newDeque.addLast(arrayDeque.pollFirst());
            counter+=1;
        }
        newDeque.getFirst();
        newDeque.addAll(arrayDeque);
        arrayDeque=newDeque;
    }

    public interface Block<T>{
        public void apply(T x);
    }

    public static <T> long  getRunningTime  (T x, Block <T> lamda) {
        long start=System.currentTimeMillis();
        lamda.apply(x);
        long end=System.currentTimeMillis();
        return end-start;
    }
}
