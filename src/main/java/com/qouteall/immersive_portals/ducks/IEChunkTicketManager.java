package com.qouteall.immersive_portals.ducks;

import net.minecraft.server.world.ChunkTicket;
import net.minecraft.util.collection.SortedArraySet;

public interface IEChunkTicketManager {
    void mySetWatchDistance(int newWatchDistance);
    
    SortedArraySet<ChunkTicket<?>> portal_getTicketSet(long chunkPos);
}
