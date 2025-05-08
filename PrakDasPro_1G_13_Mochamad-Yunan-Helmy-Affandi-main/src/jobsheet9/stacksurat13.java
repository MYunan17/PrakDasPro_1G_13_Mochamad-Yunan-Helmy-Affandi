public class stacksurat13{
    Surat13[] stack;
    int top,size;
  public stacksurat13(int size){
    this.size = size;
    stack = new Surat13[size];
    top = -1;
  }  
  public boolean isFull(){
    if (top == size -1) {
        return true;
    } else {
        return false;
    }
  }
  public boolean isEmpty(){
    if (top == -1) {
        return true;
    }else {
        return false;
    }
  }
  public void push(Surat13 srt){
    if (!isFull()) {
        top++;
        stack[top] = srt;
    }else{
        System.out.println("Stack penuh ! tidak bisa menambahkan tugas lagi.");
    }
  }
  public Surat13 pop(){
    if (!isEmpty()) {
        Surat13 srt = stack[top];
        top--;
        return srt;
    } else {
        System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
        return null;
    }
  }
  public Surat13 peek(){
    if (!isEmpty()) {
        return stack[top];
    }else {
        System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
        return null;
    }
  }
}
