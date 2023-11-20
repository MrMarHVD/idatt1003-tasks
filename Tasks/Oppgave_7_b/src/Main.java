// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        TextProcessor textProcessor = new TextProcessor("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ultricies, metus at eleifend mattis, dolor quam hendrerit lectus, quis convallis tellus nulla ac libero. Donec eget nulla auctor, cursus quam vel, commodo nisl. Phasellus a est a erat elementum ultricies eget vitae mauris. Nulla consectetur felis tristique lobortis suscipit. Duis maximus mauris leo. Vestibulum finibus tempor purus, eu mollis ex sodales quis. Sed sit amet tincidunt tortor. Pellentesque in nisl mattis, dapibus diam quis, auctor est. Nunc vitae mi pellentesque, sodales velit ut, pellentesque metus. Vivamus pharetra leo at consequat sagittis. Duis ut ex vitae purus ullamcorper tristique in vitae felis.\n" +
                "\n" +
                "Vestibulum elementum vestibulum eleifend. Suspendisse vestibulum nibh porta, tempus quam vitae, euismod ex. Nunc bibendum mollis posuere. Fusce malesuada ligula venenatis lorem imperdiet, vitae egestas sem placerat. Pellentesque pretium neque at est molestie, sed luctus justo bibendum. Sed sem est, lobortis ac ex id, euismod dapibus tortor. Nulla quis accumsan eros, sit amet interdum sapien.\n" +
                "\n" +
                "Nam pellentesque vestibulum venenatis. Nunc posuere metus ut lobortis volutpat. Donec dapibus sem ut nisi hendrerit luctus. Nunc tempus magna et tortor ullamcorper, quis lobortis massa fermentum. Etiam pharetra turpis a laoreet blandit. Aenean id nulla sit amet risus elementum placerat a sed nisi. Nunc vitae gravida ipsum. In fermentum, turpis eu iaculis posuere, erat metus dapibus ex, eget lacinia ipsum elit at enim. Curabitur interdum neque eu nunc molestie pulvinar non sit amet leo.\n" +
                "\n" +
                "Aenean urna magna, molestie vel vulputate et, rhoncus ut magna. Nunc egestas arcu ac tellus mollis commodo. Suspendisse at eleifend nisi, at placerat ligula. Mauris blandit pellentesque massa, eu semper elit vestibulum non. Nullam aliquam pellentesque sagittis. Integer sit amet diam eu nisl accumsan porttitor. Cras vel turpis malesuada, pulvinar eros in, porta nunc. Aenean hendrerit diam et ipsum mattis sagittis. Mauris efficitur dictum diam, at commodo odio vehicula at. Ut sagittis, dolor in consequat fermentum, ante augue tempor metus, hendrerit tincidunt ante leo at leo. Quisque tristique, ipsum at feugiat luctus, sem mauris imperdiet neque, et luctus arcu tellus vel tortor. Etiam vitae mollis risus, eget suscipit nunc. Nam tincidunt odio nec interdum fermentum.\n" +
                "\n" +
                "Nam faucibus dui non nibh cursus, nec aliquet nisl scelerisque. Suspendisse eu gravida quam. Aenean dapibus magna nulla, vitae rutrum urna tristique vitae. Vivamus placerat odio vitae elit cursus dapibus. Donec placerat nisi non felis fringilla, a fermentum risus sagittis. Nullam dapibus ipsum a fringilla tempor. Curabitur bibendum diam at nunc congue tempor. Vestibulum interdum dolor at malesuada convallis. Suspendisse sit amet euismod dolor, vitae egestas magna.");
        System.out.println("Number of words " + textProcessor.numOfWords());
        System.out.println("Mean word length: " + textProcessor.meanWordLength());
        System.out.println("Number of words per period: " + textProcessor.numOfWordsPerPeriod());
        textProcessor.replaceWord("test", "nothing");
        System.out.println(textProcessor.getText());
    }

    }
