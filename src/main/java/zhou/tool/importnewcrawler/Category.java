package zhou.tool.importnewcrawler;

import java.io.Serializable;

/**
 * Created by zhou on 16-1-1.
 */
public enum Category implements Serializable {

    all("所有", ""), news("资讯", "news"), web("Web", "web-development"), architecture("架构", "architecture"),
    basic("基础技术", "basic"), books("书籍", "books"), tutorial("教程", "tutorial");

    Category(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    String name;
    String tag;

    public static Category getByTag(String tag) {
        for (Category category : values()) {
            if (category.tag.equals(tag)) {
                return category;
            }
        }
        return all;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
