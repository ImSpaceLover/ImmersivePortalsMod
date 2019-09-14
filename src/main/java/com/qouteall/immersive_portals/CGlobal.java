package com.qouteall.immersive_portals;

import com.qouteall.immersive_portals.render.*;
import com.qouteall.immersive_portals.teleportation.ClientTeleportationManager;
import net.minecraft.client.render.FrustumWithOrigin;
import net.minecraft.world.dimension.DimensionType;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CGlobal {
    public static PortalRenderer renderer;
    public static RendererUsingStencil rendererUsingStencil;
    public static RendererUsingFrameBuffer rendererUsingFrameBuffer;
    public static RendererDummy rendererDummy = new RendererDummy();
    
    public static ClientWorldLoader clientWorldLoader;
    public static MyGameRenderer myGameRenderer;
    public static ClientTeleportationManager clientTeleportationManager;
    
    public static WeakReference<FrustumWithOrigin> currentFrustumCuller;
    
    public static boolean doUseAdvancedFrustumCulling = true;
    public static int maxPortalLayer = 3;
    public static int maxIdleChunkRendererNum = 500;
    public static Object switchedFogRenderer;
    public static boolean useHackedChunkRenderDispatcher = true;
    public static boolean isClientRemoteTickingEnabled = true;
    public static boolean isOptifinePresent = false;
    public static boolean renderPortalBeforeTranslucentBlocks = true;
    public static boolean useFrontCulling = true;
    public static Map<DimensionType, Integer> renderInfoNumMap = new ConcurrentHashMap<>();
    
    public static boolean doDisableAlphaTestWhenRenderingFrameBuffer = true;
    
    public static boolean isRenderDebugMode = false;
    
    public static ShaderManager shaderManager;
    
    
}