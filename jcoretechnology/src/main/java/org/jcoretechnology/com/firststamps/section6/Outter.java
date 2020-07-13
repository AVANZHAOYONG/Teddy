package org.jcoretechnology.com.firststamps.section6;

/**
　 * Sword基础技术平台项目 - 核心框架
　 * <p>org.jcoretechnology.com.firststamps.section6</p>
　 * <p>Title: Outer.java</p>
　 * <p>Description: @TODO </p>
　 * <p>Copyright: Copyright (c) 2020 中国软件与技术服务股份有限公司</p>
　 * <p>Company: 中国软件与技术服务股份有限公司</p>
　 * @author 赵勇
　 * @date 2020年7月12日 下午5:16:31
　 * @version 1.0
*/
public class Outter {
    private String interval;
    private boolean beep;
    
    public Outter(String interval, boolean beep) {
        super();
        this.interval = interval;
        this.beep = beep;
    }
    
    private Inner inner = new Inner() ; 
    
    /* (non-Javadoc)
        * <p>Title: toString</p>
        * <p>Description: @TODO</p>
        * @return
        * @see java.lang.Object#toString()
        */
    @Override
    public String toString() {
        String name1 = inner.getName1();
        
        return super.toString();
    }

    class Inner{
        private String name1 = interval;
        private String name2 = Outter.this.interval;
        public String getName1() {
            return name1;
        }
        public void setName1(String name1) {
            this.name1 = name1;
        }
        public String getName2() {
            return name2;
        }
        public void setName2(String name2) {
            this.name2 = name2;
        }
        
    }

    public static class Inner2{
        private String abc = "";
    }
    
    public static void main(String[] args) {
        Outter outter = new Outter("inter123", false);
        
        Outter.Inner a = outter.new Inner();
        System.out.println(a.getName1());
        
    }
    
}
