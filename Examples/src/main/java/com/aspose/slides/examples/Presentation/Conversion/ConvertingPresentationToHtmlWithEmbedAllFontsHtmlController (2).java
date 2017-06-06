package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController {

	public static void main(String[] args) {

	//ExStart:ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController	
        String dataDir = RunExamples.getGetDataDir_Conversion();
     Presentation pres = new Presentation(dataDir+"pres.pptx");
  try
     {
         // exclude default presentation fonts
         String[] fontNameExcludeList = { "Calibri", "Arial" };


         Paragraph para = new Paragraph();
         ITextFrame txt;

         EmbedAllFontsHtmlController embedFontsController = new EmbedAllFontsHtmlController(fontNameExcludeList);

         LinkAllFontsHtmlController linkcont = new LinkAllFontsHtmlController(fontNameExcludeList, "C:/Windows/Fonts/");

         HtmlOptions htmlOptionsEmbed = new HtmlOptions();
         htmlOptionsEmbed.setHtmlFormatter(HtmlFormatter.createCustomFormatter(linkcont));

         pres.save("pres.html", SaveFormat.Html, htmlOptionsEmbed);
     }
  finally {
   if (pres != null) pres.dispose();
  }
//ExEnd:ConvertingPresentationToHtmlWithEmbedAllFontsHtmlController
}

}
