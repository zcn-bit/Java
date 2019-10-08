public class Article {
    String title;
    String author;
    String content;
    String publishedAt;

    @Override
    public boolean equals(Object obj) {//Object是一切类的父类
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Article)) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        Article a = (Article)obj;//强转
        if (!title.equals(a.title)) {//title 和a.title  
            return false;
        }

        if (!author.equals(a.author)) {
            return false;
        }

        if (!content.equals(a.content)) {
            return false;
        }

        return publishedAt.equals(a.publishedAt);
    }
}
