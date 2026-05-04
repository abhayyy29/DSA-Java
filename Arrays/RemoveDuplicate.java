class RemoveDuplicate{
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,3};
        RemoveDuplicate ab = new RemoveDuplicate();
        System.out.println(ab.removeDuplicate(arr));
    }
    public int removeDuplicate(int[] arr){
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                    }
        }
        return i + 1;
    }
}