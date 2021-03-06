package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import org.jboss.netty.buffer.ChannelBufferFactory;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import static org.traccar.helper.DecoderVerifier.verify;
import org.junit.Test;

public class SkypatrolProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        SkypatrolProtocolDecoder decoder = new SkypatrolProtocolDecoder(null);
        decoder.setDataManager(new TestDataManager());
        ChannelBufferFactory factory = new HeapChannelBufferFactory();

        byte[] buf1 = {0x00,0x05,0x02,0x10,0x04,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF,0x00,0x00,0x00,0x0D,0x31,0x31,0x34,0x37,0x37,0x35,0x38,0x33,0x00,(byte)0xCB,0x00,0x00,0x00,0x00,0x0E,0x11,0x07,0x0C,0x01,0x01,(byte)0x84,(byte)0xD0,0x32,(byte)0xFB,0x38,0x41,0x37,0x00,0x00,0x00,0x00,0x16,0x07,0x2B,0x00,0x00,0x17,0x05,0x00,0x32,0x00,0x00,0x00,0x00,0x00,0x00,0x02,0x4E,0x0C,0x07,0x11,0x16,0x07,0x2C,0x10,0x59,0x00,0x05,0x00,0x00,0x00,0x00,0x00,0x05,0x00,0x00,0x00,0x00,0x00,0x05,0x00,0x00,0x00,0x00,0x03,0x10,0x02,0x60,(byte)0xB7,0x36,0x3B,0x63,0x06,(byte)0xC1,0x1A,0x00,(byte)0xB7,0x36,0x37,(byte)0xF2,0x06,(byte)0xBF,0x19,(byte)0xB7,0x36,0x37,(byte)0xF1,0x06,(byte)0xB5,0x0E,(byte)0xB7,0x36,0x38,(byte)0xB1,0x06,(byte)0xBB,0x0B,(byte)0xB7,0x36,0x3B,0x61,0x06,(byte)0xB8,0x0A,(byte)0xB7,0x36,0x37,(byte)0xF3,0x06,(byte)0xB7,0x09,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x0C};
        verify(decoder.decode(null, null, factory.getBuffer(buf1, 0, buf1.length)));

    }

}
