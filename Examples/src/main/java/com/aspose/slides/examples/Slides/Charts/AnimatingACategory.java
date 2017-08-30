package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.EffectChartMajorGroupingType;
import com.aspose.slides.EffectSubtype;
import com.aspose.slides.EffectTriggerType;
import com.aspose.slides.EffectType;
import com.aspose.slides.IChart;
import com.aspose.slides.IShapeCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.Sequence;
import com.aspose.slides.examples.Utils;

public class AnimatingACategory {

	public static void main(String[] args) {

//ExStart:AnimatingACategory
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AnimatingACategory.class);

		// Load a presentation
		Presentation pres = new Presentation(dataDir + "ExistingChart.pptx");
		try {
			ISlide slide = pres.getSlides().get_Item(0);
			IShapeCollection shapes = slide.getShapes();
			IChart chart = (IChart) shapes.get_Item(0);

			slide.getTimeline().getMainSequence().addEffect(chart, EffectType.Fade, EffectSubtype.None, EffectTriggerType.AfterPrevious);
			((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart, EffectChartMajorGroupingType.ByCategory, 0, EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);
			((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart, EffectChartMajorGroupingType.ByCategory, 1, EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);
			((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart, EffectChartMajorGroupingType.ByCategory, 2, EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);
			((Sequence) slide.getTimeline().getMainSequence()).addEffect(chart, EffectChartMajorGroupingType.ByCategory, 3, EffectType.Appear, EffectSubtype.None, EffectTriggerType.AfterPrevious);

			pres.save(dataDir + "Sample_Animation_C.pptx", SaveFormat.Pptx);
		} finally {
			if (pres != null)
				pres.dispose();
		}
//ExEnd:AnimatingACategory

	}
}
