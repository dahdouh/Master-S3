package tp.metaprogramming.memo.simulator.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import memo.MemoPackage;
import memo.World;

import org.eclipse.jface.dialogs.MessageDialog;



/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class BirthdayHandler extends AbstractHandler {
	private static final String modelPath=
				"/home/ariale/Master-S3/metaprog/runtime-New_configuration/"+
				"tp.metaprogramming.memo.model/My.memo";
	private static ResourceSet resSet=null;
	
	private static EObject loadModel() throws IOException {
		XMIResourceImpl resource = new XMIResourceImpl();
		resSet.getResources().add(resource);
		resource.load(new FileInputStream(new File(modelPath)),new HashMap<Object,Object>());
		return resource.getContents().get(0);
	}
	
	private static void saveModel(EObject container) throws IOException{
		FileOutputStream fileOutputStream=new FileOutputStream(new File(modelPath));
		container.eResource().save(fileOutputStream,new HashMap<Object,Object>());
	}
	
	private static void initResourceSet(){
		if(resSet!= null)
				return;
		resSet=new ResourceSetImpl();
		resSet.getPackageRegistry().put("http://www.example.org.memo",MemoPackage.eINSTANCE);
		resSet.getURIConverter().getURIMap().put(URI.createURI("http://www.example.org.incrementation"),
				URI.createURI(MemoPackage.eINSTANCE.getNsURI()));
	}
	
	
	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		initResourceSet();
		
		try{
			World container=(World) loadModel();
			container.getPopulation().forEach(p-> p.birthday());
			saveModel(container);
		}catch (IOException e){
			e.printStackTrace();
		}
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Simulator",
				"HappyBirthday");
		return null;
	}
}
