package net.togogo.utils;

public class PageSupport {
    //当前页数
    private int pageNo;

    //总页数
    private  int totalPageCount;

    //页面的大小
    private int pageSize;

    //数据的总数量
    private int proCount;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        if(pageNo>0){
            this.pageNo = pageNo;
        }
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        if(totalPageCount>0) {
            this.totalPageCount = totalPageCount;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if(pageSize>0){
        this.pageSize = pageSize;
        }
    }

    public int getProCount() {
        return proCount;
    }

    public void setProCount(int proCount) {
        if(proCount>0) {
            this.proCount = proCount;
            //得到总页数
            this.totalPageCountDS();
        }
    }


    //计算总页数
    public void totalPageCountDS(){
        if(this.proCount % this.pageSize == 0){
            this.totalPageCount =this.proCount/this.pageSize;
        }else if(this.proCount % this.pageSize != 0){
            this.totalPageCount =(this.proCount/this.pageSize)+1;
        }else{
            this.totalPageCount =1;
        }
    }
}
