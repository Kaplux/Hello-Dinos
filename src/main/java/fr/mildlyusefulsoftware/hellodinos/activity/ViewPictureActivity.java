package fr.mildlyusefulsoftware.hellodinos.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a14ff01a29b943b";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://images2.wikia.nocookie.net/__cb20090520214750/uncyclopedia/images/c/ce/Dinosaur.jpg",
				"http://www.hellokids.com/_uploads/_tiny_galerie/200805/dinosaur-source_13k.jpg",
				"http://www.linternaute.com/savoir/diaporama/dubai/images/dinosaur-world.jpg",
				"http://www.wired.com/images_blogs/wiredscience/images/2007/06/13/dinosaur.jpg",
				"http://static.ddmcdn.com/gif/dinosaur-images-002-resize.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/d/d9/Styracosaurus_dinosaur.png",
				"http://www.rareresource.com/images/dinosaurs/allosaurus-dinosaur.png",
				"http://upload.wikimedia.org/wikipedia/commons/b/bb/Megalosaurus_dinosaur.png",
				"http://rocr.xepher.net/weblog/images/trex.jpg",
				"http://legacy-cdn.smosh.com/smosh-pit/1/dinosaur-1.jpg",
				"http://www.thegreenhead.com/imgs/camarasaurus-dinosaur-replica-5.jpg",
				"http://www.dinosaurusi.com/foto/all/Camarasaurus/Dinosaurus_-_Dinosaur_-_Dinosaurio_-_Dinosaure_-_Camarasaurus002.jpg",
				"http://www.dinosaurusi.com/foto/all/Camarasaurus/Dinosaurus_-_Dinosaur_-_Dinosaurio_-_Dinosaure_-_Camarasaurus001.jpg",
				"http://www.dinosaurusi.com/foto/all/Charonosaurus/Dinosaurus---Dinosaur---Dinosaurio---Dinosaure---Charonosaurus002.jpg",
				"http://www.dinosaurusi.com/foto/all/Charonosaurus/Dinosaurus_-_Dinosaur_-_Dinosaurio_-_Dinosaure_-_Charonosaurus001.jpg",
				"http://3.bp.blogspot.com/-Tw1w-4GRWv8/Tyig19_bzaI/AAAAAAAAAmE/iknOnlF7Y7w/s1600/dinosaurs-running.jpg",
				"http://i.dailymail.co.uk/i/pix/2008/06/13/article-1026340-0199DBB800000578-587_468x304.jpg",
				"http://www.dinosaurusi.com/video_slike/0PPvvYsMq5-Dinosaurus_-_Dinosaur_-_Dinosaurio_-_Dinosaure_-_Plateosaurus006.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/e/e8/Centrosaurus_dinosaur.png",
				"http://www.deviantart.com/download/95582564/Centrosaurus_by_Jessada_Nuy.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/e/e4/Alamosaurus_sanjuanensis_dinosaur.png",
				"http://upload.wikimedia.org/wikipedia/commons/9/92/Edmontonia_dinosaur.png",
				"http://upload.wikimedia.org/wikipedia/commons/a/ab/Abrictosaurus_dinosaur.png",
				"http://upload.wikimedia.org/wikipedia/commons/9/91/Zalmoxes_dinosaur.png",
				"http://upload.wikimedia.org/wikipedia/commons/2/27/Nipponosaurus_dinosaur.png",
				"http://upload.wikimedia.org/wikipedia/commons/8/8b/Achelousaurus_dinosaur.png",
			//	"http://3.bp.blogspot.com/_ozM12geiang/TBpt-FwWvbI/AAAAAAAAA4A/BHGf-lpQmgg/s1600/Minmi.png",
				"http://en.es-static.us/upl/2011/11/sauropod_800.jpg",
				"http://www.isgtw.org/sites/default/files/img_2011/TRex.JPG",
				"http://www.cosmosmagazine.com/files/imagecache/news/files/news/600px-Europasaurus_holgeri_detail_0.png",
				"http://www.wondermondo.com/Images/Oceania/Australia/Victoria/Atlascopcosaurus.jpg",
				"http://www.deccanchronicle.com/sites/default/files/imagecache/article_horizontal/article-images/Allosaurus.jpg.crop_display.jpg",
				"http://www.encyclo123.com/files/tyrannosaure.jpg",
				"http://2.bp.blogspot.com/_US-DW8alwUM/TKIquxIq8PI/AAAAAAAAAaw/jqjVcYgjOig/s1600/654px-Balaur_bondoc.jpg",
				"http://img.photobucket.com/albums/v478/Dwaggie67/Dinosaurs/OMB%20Pics/allosaurus.jpg",
				"http://i.telegraph.co.uk/multimedia/archive/01514/Dracorex_BW_1514826c.jpg",
				"http://evan22.edublogs.org/files/2010/04/brachiosaurus.jpg",
				"http://miraclesseoceane.m.i.pic.centerblog.net/lbyumqep.gif",
				"http://i.ytimg.com/vi/-9MLlbTQI4k/0.jpg",
				"http://cdn2-b.examiner.com/sites/default/files/styles/large_lightbox/hash/84/04/1336690382_Diplodocus%20Dinosaur.jpeg",
				"http://img.photobucket.com/albums/v478/Dwaggie67/Dinosaurs/OMB%20Pics/Tuojiangosaurus.jpg",
				"http://i19.servimg.com/u/f19/09/01/38/89/herrer11.jpg",
				"http://lh4.ggpht.com/_ozM12geiang/SoYTIwBi4cI/AAAAAAAAAdA/nYBthBaIJAE/Laelops-Charles_Knight-1896.jpg",
				"http://blogs.smithsonianmag.com/dinosaur/files/2012/02/Lambeosaurus-magnicristatus-wk.jpg",
				"http://www.havanatimes.org/wp-content/uploads/2011/04/800px-Darica_Dinasour_Nivet-Dilman.jpg",
				"http://i20.servimg.com/u/f20/09/01/38/89/din_st12.jpg"
			
		
		};
		int i=0;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("hellodinos",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
