�}�  �:   �"D7 �a	��*m#>�,&Fت���G/��T�PI��$����>����Ʋ=C_v��y����!�κ�����$�y��(7��8�Q�`��A�"�����~C��E�y	��;�#M�	�5U�ԁ+�g�S��E<�P�
��?�p|��Z�I���딄�
������a��И�It�4r6]�;���z��@���HsS�e������K���N��Y�Y��潥c&㋺���IҐ�Y{b����y,�G�_7�Tr������f(���3�@k$#�z�ݡ�s�^�>�����#ͨ���ؿ�vx�l��dG��^�P�	<D�J��yM�9���?j���Qd�ɹM$g&��7�$��r�p�*�ɦ���4o[�k��Ď�+��u^�$�j�(Jw�RÃ��|�2�^ޟ֧�>z�b[G�P���xta��چ&�Ъ(�٢`5�������,B;���YH�,�0��>�?�lD%T��@�����;}2��/.�s_�V�+~H�E�����66�ݱ���gQRGpV{(2�D?ě�H��{�ʔ�I')���cD�w���9��v�Njgl���H�q�JDwC�����)�Aµ:�}&KԎMMWw&+׵�)�l�<#x�\Kʸ��{ܔ�^�,���'R�Z�wXt� ��U��s��M���7X��U�?��ʇn�: w�sc*+��J~�$/�v�Y#�1m+���� `ꑛ������=���H�4�T�����Z�u]�k�N|�S@�*��iq��0�1��?���a�pw�$�>6��>�2?���i�M2�
-Sa)額aK��/3Vn�֬���Ԃ�I��?�-\R�|, �!Fɝ\?����l�u^��&�����ZW��Y}����o�x=�v���]��N�O{��z�~G��2���Vm�b�"Zܬ5�8W��7m�M~�ʙ� i4�����)BW��#&|/yZܝE�$�z�O�;���o��j�W}�l]/<E�*eq{���B��>��P׻[x0�Dz�� �����A�[y��
6c�Q�79d�r�==����Q�d�؞חS�[�m�mX+
�R�X��1�B,P�"�(;FY, ���F�����!^T�$����g`Z�iH�ºg��������{TYwT7jޘB�F��T�і���� �e�8�܀q���+)�ڱ*jQ�#�L�ƙ���d���4�z|�m��a#�T�d�����=�q�nX}�Ǆ�#� {7K��6����r�T�!�Y��$j:�?��f�ML�\"���y�%Ǻ�]�`�4���de��/"�{�k��},>ֹ��\~[k�Š�7�ɩͥ�<�f\�����	�eM���-5��8�G△�����|�#��**7��t�M���NA1	;�~�>A�r)60�^��r���,saE%�<N�ՙ;0sl��;<2W"��\��d8��@^7(�qGk#���qCt=Y��փ�:δ��Tbl"��At>s�� �rh�ZO���F�-x�lD)�E�TQ�X0�S�/P�(�x�cA�Xs�}_'ePo�O���R.ӰZ"�iűi�U���>� �X��ńm5��Fa������Jj�ζ�}��s�"O<X.�g�q*r�+����I��:7�(ꩮ���2��yo���hp����3J:��A��h�&����n*-�Ju��6���:<Q5	�� f����\xמ����đTy���>����Ϛ� ���_ �V��@[��� � �wa3h��D"�5 ��ʴ�r`��S?�J�#F⯂�q��'D�i:��G�x�崅;�ݵqW%�ڢ���R���_�b_@ZkD>[u�~���Xc�͠��B6� �����8��4Ζ���6:7��4@�r)JDc��i��&�e��;�'Y��Ԑ6X��T�l���܆	�f���:��j��·t�f�8�D��se?�)�f�6��n������߁�b=������>�@�Ш�b�rB�Ur�,SO�i�-	��8�E�2���
Η�`&     * @param value_l 数据低位
     * @return
     */
    public static double getValueForHighAndLow(byte value_h, byte value_l) {
        double c = 0;
        try {
            int a = value_h & 0xFF;
            int b = value_l & 0xFF;
            c = a * 256 + b;
            // c = new BigDecimal(c).divide(new BigDecimal(100)).doubleValue();
        } catch (Exception e) {

        }
        return c;
    }

}
